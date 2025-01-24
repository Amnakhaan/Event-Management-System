package event;
import dataaccess.EventTypeDatabase;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Select_Event extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_Event frame = new Select_Event();
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
	private EventTypeDatabase eventTypeDatabase;
	public Select_Event() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(80, 116, 75));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECT EVENT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(290, 59, 236, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\upper.png"));
		lblNewLabel_1.setBounds(0, 0, 193, 72);
		contentPane.add(lblNewLabel_1);
		
		
		eventTypeDatabase = new EventTypeDatabase();
		JButton btnNewButton = new JButton("VIRTUAL EVENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventTypeDatabase.updateEventType("VIRTUAL");
				Virtual_Event Virtual_EventFrame = new Virtual_Event();
				Virtual_EventFrame.setVisible(true); 
				}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(41, 356, 193, 49);
		contentPane.add(btnNewButton);
		
		JButton btnHybridEvent = new JButton("HYBRID EVENT");
		btnHybridEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventTypeDatabase.updateEventType("HYBRID");
				Hybrid_Event Hybrid_EventFrame = new Hybrid_Event();
				Hybrid_EventFrame.setVisible(true);
			}
		});
		btnHybridEvent.setForeground(Color.BLACK);
		btnHybridEvent.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnHybridEvent.setBounds(313, 356, 175, 49);
		contentPane.add(btnHybridEvent);
		
		JButton btnOnsiteEvent = new JButton("ONSITE EVENT");
		btnOnsiteEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventTypeDatabase.updateEventType("ONSITE");
				Onsite_Event Onsite_EventFrame = new Onsite_Event();
				Onsite_EventFrame.setVisible(true);
			}
		});
		btnOnsiteEvent.setForeground(Color.BLACK);
		btnOnsiteEvent.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnOnsiteEvent.setBounds(573, 356, 175, 49);
		contentPane.add(btnOnsiteEvent);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\virtual.png"));
		lblNewLabel_3.setBounds(27, 114, 236, 191);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\hooo.png"));
		lblNewLabel_2.setBounds(273, 119, 242, 191);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setIcon(new ImageIcon("D:\\PROGRAMS\\SDA_Project\\src\\image\\heeeeee.png"));
		lblNewLabel_4.setBounds(561, 133, 187, 135);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage mainPageFrame = new MainPage();
				mainPageFrame.setVisible(true);
			}

	
		});
		btnNewButton_1.setBounds(651, 11, 91, 23);
		contentPane.add(btnNewButton_1);
	}

}
