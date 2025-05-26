import java.sql.*;

public class InsertUpdateJDBC {

        final String URL = "jdbc:mysql://localhost:3306/prince";
        final String USER = "root";
        final String PASSWORD = "muthu2005:";

    public void insertStudent(String name, String email) {
        String query = "INSERT INTO students (name, email) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            int rowsInserted = stmt.executeUpdate();
            System.out.println("Inserted: " + rowsInserted + " row(s)");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String name, String email) {
        String query = "UPDATE students SET name = ?, email = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, id);
            int rowsUpdated = stmt.executeUpdate();
            System.out.println("Updated: " + rowsUpdated + " row(s)");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Example usage
    public static void main(String[] args) {
        InsertUpdateJDBC dao = new InsertUpdateJDBC();
        dao.insertStudent("John Doe", "john@example.com");
        dao.updateStudent(1, "Johnny Doe", "johnny@example.com");
    }
}
