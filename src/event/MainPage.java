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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(80, 116, 75));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\upper.png"));
		lblNewLabel.setBounds(0, 0, 203, 75);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("CREATE  EVENTS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select_Event Select_EventFrame = new Select_Event();
				Select_EventFrame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(263, 55, 280, 44);
		contentPane.add(btnNewButton);
		
		JButton btnOngoingEvents = new JButton("ONGOING  EVENTS");
		btnOngoingEvents.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnOngoingEvents.setBounds(263, 133, 280, 44);
		contentPane.add(btnOngoingEvents);
		
		JButton btnVendorInformation = new JButton("VENDOR  INFORMATION");
		btnVendorInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vendor_Information Vendor_InformationFrame = new Vendor_Information();
				Vendor_InformationFrame.setVisible(true);
			}
		});
		btnVendorInformation.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnVendorInformation.setBounds(263, 207, 280, 44);
		contentPane.add(btnVendorInformation);
		
		JButton btnNewButton_1 = new JButton("Log Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome welcomeFrame = new welcome();
				welcomeFrame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(361, 278, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\neww.png"));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setBounds(141, 324, 532, 137);
		contentPane.add(lblNewLabel_1);
	}

}
