package org.frc5459.robot;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

import org.strongback.control.SoftwarePIDController.SourceType;

public class TurnToPIDCommand {

	
	 turnToPid = new SoftwarePIDController(model::getActualValue, model::setValue).withGains(0.9, 0.0, 0.0)
			 +                                                                              .withInputRange(-1.0, 1.0)
			 +                                                                              .withOutputRange(-1.0, 1.0)
			 +                                                                              .withTolerance(0.02)
			 +                                                                              .withTarget(0.5);
}
