import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

public class Countdown {

	double countdownTime;
	double totalTime;
	double ClicksPerSecond;
	boolean started = false;
	Timer timer;
	private MyFrame frame;
	ArrayList<Double> scores = new ArrayList<>();
	Countdown(MyFrame frame) {
		this.frame = frame;
	}

	public void startCountdown() {
		timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MyFrame.displayCountdown.setText("Seconds remaning: " + Double.toString(countdownTime));
				countdownTime--;
				if (countdownTime == 0) {
					timer.stop();
					ClicksPerSecond = MyFrame.clickCount/totalTime;
					MyFrame.displayCPS.setText(Double.toString(ClicksPerSecond) + " Clicks Per Second");
					scores.add(ClicksPerSecond);
					Double highest = scores.get(0);
					for (double i: scores) {
						if (highest < i) {
							highest = i;
						}
					}
					MyFrame.displayScores.setText("Best CPS: " + Double.toString(highest) + " Clicks Per Second");
					MyFrame.clickCount = 0;
					// frame.displayClicks.setText("0 Clicks");
					started = false;
				}

			}
		});
		timer.start();
		started = true;
	}
	

	public void setCountdown(int countdown) {
		this.countdownTime = countdown;
		totalTime = countdown;
	}

}
