import java.sql.*;

public class MysqlConnection {
    public static void main(String[] args) {
        final String URL = "jdbc:mysql://localhost:3306/prince";
        final String USER = "root";
        final String PASSWORD = "muthu2005:";
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS students(Name VARCHAR(100), Roll_no INT, Dept VARCHAR(100))"
            );
            preparedStatement.executeUpdate();
            System.out.println("Query execution successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
