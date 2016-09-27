package interfaces;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import times.Timer;
import interfaces.Gui;




public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Timer timer = new Timer();
		
		Gui window = new Gui();
		
		
		try {
			reader.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		timer.reset(3600000*12);
		timer.start();
		while(timer.getremainingTimeMillis()>0)
		{
			window.timerLabel.setText(timer.getRemHours()+":"+timer.getRemMinutes()+":"+""+timer.getRemSeconds()+":"+timer.getRemMilliSeconds());
			//System.out.println(timer.getremainingTimeMillis());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		window.timerLabel.setText(""+timer.getRemSeconds());
		System.out.println("DAFAQ"+timer.getremainingTimeMillis());
		
		
	}

}
