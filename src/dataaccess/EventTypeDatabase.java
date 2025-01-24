// EventTypeDatabase.java

package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EventTypeDatabase {

    private static final String URL = "jdbc:mysql://localhost:3306/Event_Management_System";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public void updateEventType(String eventType) {
        try {
            Class.forName(DRIVER);

            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                // Update the most recent entry for the specified user
                String query = "UPDATE Users SET EventType = ? WHERE Username = ? ORDER BY UserId DESC LIMIT 1";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, eventType);
                    preparedStatement.setString(2, "ReplaceWithActualUsername"); // Replace with the actual username

                    int rows = preparedStatement.executeUpdate();

                    if (rows > 0) {
                        System.out.println("Event Type Updated for User: " + "ReplaceWithActualUsername");
                    } else {
                        System.out.println("No matching user found.");
                    }
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error during database operation.");
            e.printStackTrace();
        }
    }
}
