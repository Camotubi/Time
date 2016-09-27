package interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	JLabel timerLabel = new JLabel("");

	public Main() {
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
		
		JButton btnStart = new JButton("New button");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnStart.setBounds(105, 125, 89, 23);
		frame.getContentPane().add(btnStart);
		
		JButton btnPause = new JButton("New button");
		btnPause.setBounds(204, 125, 89, 23);
		frame.getContentPane().add(btnPause);
		
		JButton btnStop = new JButton("New button");
		btnStop.setBounds(303, 125, 89, 23);
		frame.getContentPane().add(btnStop);
		
		JButton btnReset = new JButton("New button");
		btnReset.setBounds(171, 159, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}
