import java.sql.*;

public class TransactionJDBC {

    final String URL = "jdbc:mysql://localhost:3306/prince";
    final String USER = "root";
    final String PASSWORD = "muthu2005:";

    public void transfer(int fromAcc, int toAcc, double amount) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            conn.setAutoCommit(false); // Begin transaction

            // 1. Deduct from sender
            PreparedStatement debitStmt = conn.prepareStatement(
                "UPDATE accounts SET balance = balance - ? WHERE account_id = ?"
            );
            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, fromAcc);
            debitStmt.executeUpdate();

            // 2. Add to receiver
            PreparedStatement creditStmt = conn.prepareStatement(
                "UPDATE accounts SET balance = balance + ? WHERE account_id = ?"
            );
            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, toAcc);
            creditStmt.executeUpdate();

            // 3. Commit if both succeed
            conn.commit();
            System.out.println("Transfer successful.");

        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback(); // Rollback if anything fails
                    System.out.println("Transaction failed. Rolled back.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();

        } finally {
            try {
                if (conn != null)
                    conn.setAutoCommit(true); // Reset auto-commit
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        TransactionJDBC dao = new TransactionJDBC();
        dao.transfer(1, 2, 200.0); // Transfer ₹200 from Alice to Bob
    }
}
