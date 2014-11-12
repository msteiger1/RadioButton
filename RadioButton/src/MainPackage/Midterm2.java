package MainPackage;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Midterm2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Midterm2 window = new Midterm2();
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
	public Midterm2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small", true);
		rdbtnSmall.setBounds(76, 74, 141, 23);
		frame.getContentPane().add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium",false);
		rdbtnMedium.setBounds(76, 109, 141, 23);
		frame.getContentPane().add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large",false);
		rdbtnLarge.setBounds(76, 144, 141, 23);
		frame.getContentPane().add(rdbtnLarge);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnSmall);
		group.add(rdbtnMedium);
		group.add(rdbtnLarge);
	}
}
