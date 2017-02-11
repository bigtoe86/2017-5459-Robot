package org.frc5459.robot;

import java.util.Timer;
import java.util.TimerTask;

import org.strongback.command.Command;



public class AutoShiftingCommand extends Command{

	int t = 0;
	double a = 0;
	double c = 432.809;
	double b = 0;
	double x = 0;
	Drive5459 drive;
	Timer timer;
	
	public AutoShiftingCommand(Drive5459 drive) {
		this.drive = drive;
		this.timer = new Timer();
	}
	
	
	@Override
	public boolean execute(){
		
		
		return false;
	}
}
