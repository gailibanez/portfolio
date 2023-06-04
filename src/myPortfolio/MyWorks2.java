package myPortfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyWorks2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWorks2 window = new MyWorks2();
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
	public MyWorks2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(-2, -2, 1924, 1044);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\anden\\OneDrive\\Pictures\\7.jpg"));
		lblNewLabel.setBounds(0, 0, 1938, 1026);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			MyWorks1 mw1 = new MyWorks1();
			mw1.main(null);
			}
	});
		btnBack.setBounds(1708, 876, 89, 77);
		frame.getContentPane().add(btnBack);
		btnBack.setOpaque(false);
	}

}
