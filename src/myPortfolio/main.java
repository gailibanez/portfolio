package myPortfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
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
		
		JLabel lblMain = new JLabel("New label");
		lblMain.setIcon(new ImageIcon("C:\\Users\\anden\\OneDrive\\Pictures\\1.jpg"));
		lblMain.setBounds(0, 0, 1938, 1026);
		frame.getContentPane().add(lblMain);
		
		JButton btnAboutMe = new JButton("");
		btnAboutMe.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			AboutMe1 ab1 = new AboutMe1();
			ab1.main(null);
			}
	});
		btnAboutMe.setBounds(909, 524, 381, 74);
		frame.getContentPane().add(btnAboutMe);
		btnAboutMe.setOpaque(false);
		
		
		JButton btnSkills = new JButton("");
		btnSkills.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			Skills sk = new Skills();
			sk.main(null);
			}
	});
		btnSkills.setBounds(1355, 524, 441, 74);
		frame.getContentPane().add(btnSkills);
		btnSkills.setOpaque(false);

		JButton btnMyWorks = new JButton("");
		btnMyWorks.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			MyWorks1 mw1 = new MyWorks1();
			mw1.main(null);
			}
	});
		btnMyWorks.setBounds(909, 667, 381, 74);
		frame.getContentPane().add(btnMyWorks);
		btnMyWorks.setOpaque(false);

		JButton btnExperiences = new JButton("");
		btnExperiences.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			Experiences exp = new Experiences();
			exp.main(null);
			}
	});
		btnExperiences.setBounds(1369, 667, 446, 74);
		frame.getContentPane().add(btnExperiences);
		btnExperiences.setOpaque(false);

	}
}
