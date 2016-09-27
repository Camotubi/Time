package interfaces;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

import times.Timer;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimerWindow {

	private JFrame frame;
	
	Timer timer = new Timer();
	JLabel timerLabel = new JLabel("");
	public TimerWindow()
	{
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
				timer.start();
				
			}
		});
		btnStart.setBounds(105, 125, 89, 23);
		frame.getContentPane().add(btnStart);
		
		JButton btnPause = new JButton("New button");
		btnPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.pause();
			}
		});
		btnPause.setBounds(204, 125, 89, 23);
		frame.getContentPane().add(btnPause);
		
		JButton btnStop = new JButton("New button");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnStop.setBounds(303, 125, 89, 23);
		frame.getContentPane().add(btnStop);
		
		JButton btnReset = new JButton("New button");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.reset(3600000*12);
			}
		});
		btnReset.setBounds(171, 159, 89, 23);
		frame.getContentPane().add(btnReset);
	}

	public static void main(String[] args) 
	{
		TimerWindow window = new TimerWindow();
	while(true)
	{
		while(window.timer.getremainingTimeMillis()>0)
		{
			window.timerLabel.setText(window.timer.getRemHours()+":"+window.timer.getRemMinutes()+":"+""+window.timer.getRemSeconds()+":"+window.timer.getRemMilliSeconds());
			//System.out.println(timer.getremainingTimeMillis());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		window.timerLabel.setText(""+window.timer.getRemSeconds());
	}
		
		
		
		
	}

}

