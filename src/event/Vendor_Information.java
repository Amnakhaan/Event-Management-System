package event;

import BuildingLogic.VendorBL;
import dataaccess.VendorDatabase;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vendor_Information extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Vendor_Information frame = new Vendor_Information();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Vendor_Information() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 500);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(80, 116, 75));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton_1 = new JButton("HOME");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MainPage MainPageFrame = new MainPage();
        		MainPageFrame.setVisible(true);
        	}
        });
       
      
        btnNewButton_1.addActionListener(e -> {
            MainPage mainPageFrame = new MainPage();
            mainPageFrame.setVisible(true);
        });
        btnNewButton_1.setBounds(655, 11, 91, 23);
        contentPane.add(btnNewButton_1);

        JLabel lblVendorsInformation = new JLabel("VENDOR'S INFORMATION");
        lblVendorsInformation.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblVendorsInformation.setBounds(223, 52, 373, 49);
        contentPane.add(lblVendorsInformation);

        // Fetch vendor data from the database
        List<VendorBL> vendors = VendorDatabase.getAllVendors();

        // Create a 2D array to hold data for the JTable
        Object[][] data = new Object[vendors.size()][6];
        for (int i = 0; i < vendors.size(); i++) {
            data[i][0] = vendors.get(i).getVendorId();
            data[i][1] = vendors.get(i).getCompanyName();
            data[i][2] = vendors.get(i).getEmail();
            data[i][3] = vendors.get(i).getContactNumber();
            data[i][4] = vendors.get(i).getWebsite();
            data[i][5] = vendors.get(i).getOfficialAddress();
        }

        // Define column names
        String[] columnNames = {"VendorId", "CompanyName", "Email", "ContactNumber", "Website", "OfficialAddress"};

        // Create JTable with data and column names
        table = new JTable(data, columnNames);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        table.getColumnModel().getColumn(0).setPreferredWidth(30); // Adjust column width if needed

        // Set the preferred size of the JScrollPane based on the number of rows
        int numRows = vendors.size();
        int rowHeight = table.getRowHeight();
        int preferredHeight = (numRows * rowHeight)+100;
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 110, 764, Math.min(preferredHeight, 500));
        contentPane.add(scrollPane);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\upper.png"));
        lblNewLabel.setBounds(0, 0, 213, 77);
        contentPane.add(lblNewLabel);
    }
}
