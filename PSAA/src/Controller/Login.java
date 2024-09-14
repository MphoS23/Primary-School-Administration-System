package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    private Connection connection; // A valid database connection object should be assigned to this field

    // Constructor to set the database connection
    public Login(Connection connection) {
        this.connection = connection;
    }

    public boolean authenticateUser(int userid, String Password) {
        String query = "SELECT * FROM user WHERE userid = ? AND Password = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, userid);
            preparedStatement.setString(2, Password);
            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next(); // Returns true if the user exists with provided credentials
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
