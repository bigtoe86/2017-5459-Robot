package org.frc5459.robot;

import org.strongback.command.Command;
import org.strongback.components.Solenoid;

public class BucketRetractCommand extends Command {
	private Solenoid bucket;
	
	
	public BucketRetractCommand(Solenoid bucket){
		this.bucket = bucket;
	}
	
	@Override
	public boolean execute(){
		bucket.retract();
		return true;
	}

}
