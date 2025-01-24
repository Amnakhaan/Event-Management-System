package dataaccess;
import BuildingLogic.VendorBL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendorDatabase {
    private static final String url = "jdbc:mysql://localhost:3306/Event_Management_System";
    private static final String user = "root";
    private static final String password = "mysql";

    // Method to retrieve all vendor information from the database
    public static List<VendorBL> getAllVendors() {
        List<VendorBL> vendors = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM Vendor";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        VendorBL vendor = new VendorBL();
                        vendor.setVendorId(resultSet.getInt("VendorId"));
                        vendor.setCompanyName(resultSet.getString("CompanyName"));
                        vendor.setEmail(resultSet.getString("Email"));
                        vendor.setContactNumber(resultSet.getString("ContactNumber"));
                        vendor.setWebsite(resultSet.getString("Website"));
                        vendor.setOfficialAddress(resultSet.getString("OfficialAddress"));
                        vendors.add(vendor);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vendors;
    }
}
