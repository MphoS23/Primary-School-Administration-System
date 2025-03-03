package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//database connection utility class for a MySQL database using JDBC
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/studentmanagementsystem";
    private static final String USER = "root"; // Assuming the default XAMPP username
    private static final String PASSWORD = ""; // Assuming the default XAMPP password

    // Establishes and returns a database connection
    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Database connection error.", e);
        }
    }
}
