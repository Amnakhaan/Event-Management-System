package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Onsite_Event extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Onsite_Event frame = new Onsite_Event();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Onsite_Event() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(80, 116, 75));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateOnsiteEvent = new JLabel("CREATE ONSITE EVENT");
		lblCreateOnsiteEvent.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblCreateOnsiteEvent.setBounds(237, 40, 316, 49);
		contentPane.add(lblCreateOnsiteEvent);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setBounds(634, 11, 96, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\upper.png"));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel.setBounds(0, 0, 225, 103);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Event Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(76, 114, 91, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNumberOfAttendees = new JLabel("Event Description");
		lblNumberOfAttendees.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNumberOfAttendees.setBounds(76, 177, 151, 27);
		contentPane.add(lblNumberOfAttendees);
		
		JLabel lblStartDate = new JLabel("Date and Time");
		lblStartDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblStartDate.setBounds(76, 233, 106, 27);
		contentPane.add(lblStartDate);
		
		JLabel lblVenueCapacity = new JLabel("Venue Capacity");
		lblVenueCapacity.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblVenueCapacity.setBounds(76, 287, 140, 27);
		contentPane.add(lblVenueCapacity);
		
		JLabel lblParkingSlots = new JLabel("Parking Slots");
		lblParkingSlots.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblParkingSlots.setBounds(76, 343, 140, 27);
		contentPane.add(lblParkingSlots);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(76, 143, 268, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 202, 268, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(76, 256, 268, 20);
		contentPane.add(textField_2);
		
		JComboBox<String> comboBox_1 = new JComboBox<>();
		comboBox_1.addItem("select capacity");
		comboBox_1.addItem("10-50");
		comboBox_1.addItem("50-200");
		comboBox_1.addItem("200-1000");
		comboBox_1.setBounds(76, 310, 267, 22);
		contentPane.add(comboBox_1);
		
		JComboBox<String> comboBox_1_1 = new JComboBox<>();
		comboBox_1_1.addItem("select slots");
		comboBox_1_1.addItem("5-10");
		comboBox_1_1.addItem("10-50");
		comboBox_1_1.addItem("50-70");
		comboBox_1_1.setBounds(76, 366, 267, 22);
		contentPane.add(comboBox_1_1);
		
		JComboBox<String> comboBox_1_2 = new JComboBox<>();
		comboBox_1_2.addItem("select Vendor");
		comboBox_1_2.addItem("QuantumTech Solutions");
		comboBox_1_2.addItem("Nexus Innovations");
		comboBox_1_2.addItem("Stellar Systems Integrators");

		comboBox_1_2.setBounds(448, 156, 293, 22);
		contentPane.add(comboBox_1_2);
		
		JLabel lblAvailableVendors = new JLabel("Available Vendors' Companies");
		lblAvailableVendors.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAvailableVendors.setBounds(448, 114, 207, 27);
		contentPane.add(lblAvailableVendors);
		
		JButton btnNewButton = new JButton("Proceed to Payment");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(508, 346, 174, 40);
		contentPane.add(btnNewButton);
	}

}
