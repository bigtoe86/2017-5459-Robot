package org.frc5459.robot;

import org.strongback.command.Command;
import org.strongback.components.Solenoid;

public class BucketRetractCommand extends Command {
	private Solenoid Bucket;
	
	
	public BucketRetractCommand(Solenoid Bucket){
		this.Bucket = Bucket;
	}
	
	@Override
	public boolean execute(){
		Bucket.retract();
		return true;
	}

}
