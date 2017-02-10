package org.frc5459.robot;

import org.strongback.command.Command;
import org.strongback.components.Solenoid;

public class BucketExtendCommand extends Command {
	private Solenoid Bucket;
	
	
	public BucketExtendCommand(Solenoid Bucket){
		this.Bucket = Bucket;
	}
	
	@Override
	public boolean execute(){
		Bucket.extend();
		return true;
	}
	

}
