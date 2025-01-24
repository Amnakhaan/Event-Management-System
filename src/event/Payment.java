package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Payment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(80, 116, 75));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\ch.png"));
		lblNewLabel_3.setBounds(525, 119, 229, 211);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome welcomeFrame = new welcome();
				welcomeFrame.setVisible(true);	
			}
		});
		btnNewButton_1.setBounds(649, 22, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblPayment = new JLabel("PAYMENT  METHODS");
		lblPayment.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPayment.setBounds(249, 22, 278, 49);
		contentPane.add(lblPayment);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\upper.png"));
		lblNewLabel_1.setBounds(0, 0, 208, 79);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Confirm Event");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage MainPageFrame = new MainPage();
				MainPageFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(292, 400, 164, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Credit Card");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(77, 327, 111, 49);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(544, 292, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\cc.png"));
		lblNewLabel.setBounds(27, 139, 224, 139);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\bt.png"));
		lblNewLabel_2.setBounds(261, 91, 251, 224);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2_1 = new JButton("Bank");
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2_1.setBounds(315, 327, 111, 49);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Check");
		btnNewButton_2_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2_2.setBounds(583, 327, 111, 49);
		contentPane.add(btnNewButton_2_2);
	}
}
