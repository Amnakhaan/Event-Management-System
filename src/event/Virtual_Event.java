package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Virtual_Event extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Virtual_Event frame = new Virtual_Event();
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
	public Virtual_Event() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(80, 116, 75));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\upper.png"));
		lblNewLabel_1.setBounds(0, 0, 210, 68);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCreateEvent = new JLabel("CREATE VIRTUAL EVENT");
		lblCreateEvent.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblCreateEvent.setBounds(278, 26, 316, 49);
		contentPane.add(lblCreateEvent);
		
		JLabel lblNewLabel = new JLabel("Event Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(70, 101, 91, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblStartDate = new JLabel("Date and Time");
		lblStartDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblStartDate.setBounds(70, 216, 106, 27);
		contentPane.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("Virtual Attendee Limit");
		lblEndDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEndDate.setBounds(70, 275, 140, 27);
		contentPane.add(lblEndDate);
		
		JLabel lblNumberOfAttendees = new JLabel("Event Description");
		lblNumberOfAttendees.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNumberOfAttendees.setBounds(70, 160, 151, 27);
		contentPane.add(lblNumberOfAttendees);
		
		textField = new JTextField();
		textField.setBounds(69, 129, 268, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 244, 267, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtTo = new JTextField();
		txtTo.setBounds(70, 185, 267, 20);
		contentPane.add(txtTo);
		txtTo.setColumns(10);
		
		JLabel lblAvailableVendors = new JLabel("Available Vendors' Companies");
		lblAvailableVendors.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAvailableVendors.setBounds(454, 101, 207, 27);
		contentPane.add(lblAvailableVendors);
		
		JButton btnNewButton = new JButton("Proceed to Payment");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(483, 374, 174, 40);
		contentPane.add(btnNewButton);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(454, 140, 268, 22);
		comboBox.addItem("Select Vendor");
		comboBox.addItem("QuantumTech Solutions");
		comboBox.addItem("Nexus Innovations");
		comboBox.addItem("Stellar Systems Integrators");
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 MainPage mainPageFrame = new MainPage();
		         mainPageFrame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(653, 11, 91, 23);
		contentPane.add(btnNewButton_1);


		JComboBox<String> comboBox_1 = new JComboBox<>();
		comboBox_1.addItem("Select Limit");
		comboBox_1.addItem("10-50");
		comboBox_1.addItem("50-250");
		comboBox_1.addItem("250-1000");
		comboBox_1.setBounds(70, 308, 267, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblStreamingLink = new JLabel("Streaming Link");
		lblStreamingLink.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblStreamingLink.setBounds(81, 341, 140, 27);
		contentPane.add(lblStreamingLink);
		
		
		JComboBox<String> comboBox_1_1 = new JComboBox<>();
		comboBox_1_1.addItem("Link");
		comboBox_1_1.addItem("meet.google.com/ypd-nhzg-abs");		
		comboBox_1_1.setBounds(70, 369, 267, 22);
		contentPane.add(comboBox_1_1);
	}
}
