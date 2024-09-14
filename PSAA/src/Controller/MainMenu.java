package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainMenu {
    private Connection connection; // Assuming you have a database connection object

    // Constructor to set the database connection
    public MainMenu(Connection connection) {
        this.connection = connection;
    }

    // Method to add a new student to the database
    public boolean addStudent(int studentID, String firstName, String lastName, String gender, int age, String birthCertificateNumber) {
        String query = "INSERT INTO student (studentID,firstname, lastname, gender, age, birthCno) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, studentID);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, gender);
            preparedStatement.setInt(5, age);
            preparedStatement.setString(6, birthCertificateNumber);

            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0; // Returns true if insertion is successful
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to associate a student with a class
    public boolean associateStudentWithClass(int studentID, int classID) {
        String query = "INSERT INTO association (StudentID, ClassID) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, studentID);
            preparedStatement.setInt(2, classID);

            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0; // Returns true if insertion is successful
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to list students associated with a class
    public ResultSet listStudentsByClass(int classID) {
        String query = "SELECT * FROM student INNER JOIN association ON student.StudentID = association.StudentID WHERE association.ClassID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, classID);

            return preparedStatement.executeQuery(); // Returns the ResultSet of students associated with the given classID
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Other methods related to the main menu functionalities can be added here
}
