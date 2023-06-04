package myPortfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AboutMe2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe2 window = new AboutMe2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutMe2() {
		initialize();
	}

	/**
	 * Initialize the contents of th e frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(-2, -2, 1924, 1044);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\anden\\OneDrive\\Pictures\\3.jpg"));
		lblNewLabel.setBounds(0, 0, 1938, 1026);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			AboutMe1 ab1 = new AboutMe1();
			ab1.main(null);
			}
	});
		btnBack.setBounds(1705, 887, 101, 67);
		frame.getContentPane().add(btnBack);
		btnBack.setOpaque(false);

	}

}
