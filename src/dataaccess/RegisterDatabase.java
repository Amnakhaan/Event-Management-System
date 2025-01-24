package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDatabase {

    // JDBC connection parameters
    private static final String URL = "jdbc:mysql://localhost:3306/Event_Management_System";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";

    // JDBC driver
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    // Insert user data into the database
    public void insertUser(String username, String organization, String email, String phoneNumber, String password) {
        try {
            // Load the MySQL JDBC driver
            Class.forName(DRIVER);

            // Establish the database connection
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {

                // Use a PreparedStatement for parameterized query
                String query = "INSERT INTO Users (Username, Organization, Email, PhoneNumber, Password) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    // Set parameter values
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, organization);
                    preparedStatement.setString(3, email);
                    
                    preparedStatement.setString(4, phoneNumber);
                    preparedStatement.setString(5, password);

                    // Execute the query
                    int rows = preparedStatement.executeUpdate();

                    if (rows > 0) {
                        System.out.println("User Data Inserted.");
                    }
                }
            }

        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}
