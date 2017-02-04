package org.frc5459.robot;
//when retracted in high gear
//puts in high gear
import org.strongback.command.Command;

public class ShiftUpCommand extends Command {
	
	Drive5459 drive;
	
	public ShiftUpCommand(){
		this.drive = null;
	}
	public ShiftUpCommand(Drive5459 drive){
		this.drive = drive;
	}
	@Override
	public boolean execute(){
		drive.retract();
        return true;
	}
}
