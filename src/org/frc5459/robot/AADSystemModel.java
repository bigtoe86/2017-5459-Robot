package org.frc5459.robot;

import org.strongback.control.SoftwarePIDController.SourceType;
import org.strongback.function.DoubleBiFunction;

public class AADSystemModel {
	private Robot theRobot;
	public AADSystemModel(Robot r) {
		
		// Don't know if this is right. 
		// Does the model need to incorporate the robot.
		this.model = (actual, newValue) -> actual + newValue;
		this.sourceType = SourceType.DISTANCE;
		this.theRobot = r;
	}
	
	// Now, define these methods from input from the robot
	 protected final DoubleBiFunction model;
     protected final SourceType sourceType;
     protected boolean print = false;


     protected double actualValue = 0;

     public  SourceType sourceType() {
         return sourceType;
     }

     public  double getActualValue() {
         return actualValue;
     }

     public  void setValue(double input) {
         double newValue = model.applyAsDouble(actualValue, input);
         if (print) System.out.println("actual=" + actualValue + "; input=" + input + "; newValue=" + newValue);
         this.actualValue = newValue;
     }
		
}
