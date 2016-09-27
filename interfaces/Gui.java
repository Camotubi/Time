package interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui {

	private JFrame frame;
	JLabel timerLabel = new JLabel("");

	public Gui() {
		initialize();
		frame.setVisible(true);
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		timerLabel.setBounds(145, 43, 134, 57);
		frame.getContentPane().add(timerLabel);
	}
}
