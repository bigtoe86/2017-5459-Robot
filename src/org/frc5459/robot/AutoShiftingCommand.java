package org.frc5459.robot;

import java.util.Timer;
import java.util.TimerTask;



public class AutoShiftingCommand {

	int t = 0;
	double a = 0;
	double c = 432.809;
	double b = 0;
	double x = 0;
	
	Timer timer = new Timer();
	TimerTask task = new TimerTask(){
		public void run(){
			t++;
			System.out.println(t);
			
		}
	};
		
	
	
	public void Start(){
		timer.scheduleAtFixedRate(task, 100, 100);
		t=t * -1;
		a=t/c;
		b=Math.pow(Math.E, a);
		x= 1-b;
		
		
		
	}
}
