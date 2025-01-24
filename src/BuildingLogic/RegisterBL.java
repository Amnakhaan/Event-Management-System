package BuildingLogic;

import dataaccess.RegisterDatabase;

public class RegisterBL {

    // Business logic to register a user
    public void registerUser(String username, String organization, String email, String phoneNumber, String password) {
        // You can perform additional business logic here if needed

        // Create an instance of Database class
        RegisterDatabase userDatabase = new RegisterDatabase();

        // Call the method to insert user data into the database
        userDatabase.insertUser(username, organization, email, phoneNumber, password);
    }
}
