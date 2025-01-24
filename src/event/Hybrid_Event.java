package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Hybrid_Event extends JFrame {

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
					Hybrid_Event frame = new Hybrid_Event();
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
	public Hybrid_Event() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(80, 116, 75));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\upper.png"));
		lblNewLabel.setBounds(0, 0, 225, 103);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setBounds(632, 11, 96, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblCreateHybridEvent = new JLabel("CREATE HYBRID EVENT");
		lblCreateHybridEvent.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblCreateHybridEvent.setBounds(254, 51, 316, 49);
		contentPane.add(lblCreateHybridEvent);
		
		JLabel lblNewLabel_1 = new JLabel("Event Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(50, 128, 91, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNumberOfAttendees = new JLabel("Event Description");
		lblNumberOfAttendees.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNumberOfAttendees.setBounds(50, 186, 151, 27);
		contentPane.add(lblNumberOfAttendees);
		
		JLabel lblStartDate = new JLabel("Date and Time");
		lblStartDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblStartDate.setBounds(50, 244, 106, 27);
		contentPane.add(lblStartDate);
		
		JLabel lblStreamingLink = new JLabel("Streaming Link");
		lblStreamingLink.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblStreamingLink.setBounds(50, 300, 140, 27);
		contentPane.add(lblStreamingLink);
		
		JLabel lblOnsiteLocation = new JLabel("Onsite Location");
		lblOnsiteLocation.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblOnsiteLocation.setBounds(50, 359, 140, 27);
		contentPane.add(lblOnsiteLocation);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(50, 155, 268, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(50, 213, 268, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(50, 269, 268, 20);
		contentPane.add(textField_2);
		
		JComboBox<String> comboBox_1 = new JComboBox<>();
		comboBox_1.addItem("Link");	
		comboBox_1.addItem("meet.google.com/ypd-nhzg-abs");	
		comboBox_1.setBounds(50, 321, 267, 22);
		contentPane.add(comboBox_1);
		
		JComboBox<String> comboBox_1_1 = new JComboBox<>();
		comboBox_1_1.addItem("Select City");
		comboBox_1_1.addItem("Islamabad");
		comboBox_1_1.addItem("Lahore");
		comboBox_1_1.addItem("Karachi");
		comboBox_1_1.setBounds(50, 384, 267, 22);
		contentPane.add(comboBox_1_1);
		
		JComboBox<String> comboBox_1_2 = new JComboBox<>();
		comboBox_1_2.addItem("select Vendor");
		comboBox_1_2.addItem("QuantumTech Solutions");
		comboBox_1_2.addItem("Nexus Innovations");
		comboBox_1_2.addItem("Stellar Systems Integrators");
		comboBox_1_2.setBounds(440, 169, 288, 22);
		contentPane.add(comboBox_1_2);
		
		JLabel lblAvailableVendors = new JLabel("Available Vendors' Companies");
		lblAvailableVendors.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAvailableVendors.setBounds(440, 128, 207, 27);
		contentPane.add(lblAvailableVendors);
		
		JButton btnNewButton = new JButton("Proceed to Payment");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(490, 362, 174, 40);
		contentPane.add(btnNewButton);
	}

}
