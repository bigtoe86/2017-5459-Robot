package org.frc5459.robot;

import org.strongback.command.Command;
import org.strongback.components.Motor;

public class AscendClimbCommand extends Command{
	private Motor ClimberMotor;
	
	public AscendClimbCommand(Motor ClimberMotor){
		this.ClimberMotor = ClimberMotor;
	}

	@Override
	public boolean execute(){
		ClimberMotor.setSpeed(1);
		return true;
	}
	
}

