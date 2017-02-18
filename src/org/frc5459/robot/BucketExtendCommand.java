package org.frc5459.robot;

import org.strongback.command.Command;
import org.strongback.components.Solenoid;

public class BucketExtendCommand extends Command {
	private Solenoid bucket;
	
	
	public BucketExtendCommand(Solenoid bucket){
		this.bucket = bucket;
	}
	
	@Override
	public boolean execute(){
		bucket.extend();
		return true;
	}
	

}
