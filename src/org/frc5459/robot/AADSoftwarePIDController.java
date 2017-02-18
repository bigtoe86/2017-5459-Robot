package org.frc5459.robot;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

import org.strongback.control.SoftwarePIDController;
import org.strongback.control.SoftwarePIDController.SourceType;
import org.strongback.function.DoubleBiFunction;

public class AADSoftwarePIDController extends SoftwarePIDController {
	
	
	public AADSoftwarePIDController(SourceType sourceType, DoubleSupplier source, DoubleConsumer output) {
		super(sourceType, source, output);
		
		// GEORGE - you can set breakpoints here.
	}
	public AADSoftwarePIDController(Supplier<SourceType> sourceType, DoubleSupplier source, DoubleConsumer output) {
		super(sourceType, source, output);
		// GEORGE - you can set breakpoints here.
	}

	private static class SystemModel {
        protected final DoubleBiFunction model;
        protected final SourceType sourceType;
        protected boolean print = false;

        public SystemModel(SourceType sourceType, DoubleBiFunction model) {
            this.model = model;
            this.sourceType = sourceType;
        }

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

    public static  SystemModel simple() {
        return simple(SourceType.DISTANCE);
    }
    public static  SystemModel simple(SourceType type) {
        return new SystemModel(type, (actual, newValue) -> actual + newValue);
    }
    
//    private SoftwarePIDController controller;
//    private edu.wpi.first.wpilibj.PIDController wpi;

    public static void main(String[] args) {
    	
    	Robot r = new Robot();

    	// THe model controls how the doubles are created
    	// for this controller.
    	AADSystemModel model = new AADSystemModel(r);
    	
    	// George - this is the basic operation.
    	// Now, you have to create the SystemModel to 
    	AADSoftwarePIDController controller = new AADSoftwarePIDController(
    			model::sourceType, 
    			model::getActualValue, 
    			model::setValue);


    }

}
