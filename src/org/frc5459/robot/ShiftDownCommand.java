package org.frc5459.robot;
//when extended in low gear
//puts in low gear
import org.strongback.command.Command;
import org.strongback.components.Solenoid;

public class ShiftDownCommand extends Command {

	Drive5459 drive;
	
	public ShiftDownCommand(){
		this.drive = null;
	}
	public ShiftDownCommand(Drive5459 drive){
		this.drive = drive;
	}
	@Override
	public boolean execute(){
		drive.extend();
        return true;
	}
}
