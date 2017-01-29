/* Created Sat Jan 14 09:56:00 EST 2017 */
package org.frc5459.robot;

import org.strongback.Strongback;
import org.strongback.SwitchReactor;
import org.strongback.components.Solenoid;
import org.strongback.components.Solenoid.Direction;
import org.strongback.components.ui.FlightStick;
import org.strongback.hardware.Hardware;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {
	private FlightStick Operator;
	private Solenoid Bucket;
	private SwitchReactor Reactor;

    @Override
    public void robotInit() {
    	Operator = Hardware.HumanInterfaceDevices.logitechAttack3D(0);
    	Bucket = Hardware.Solenoids.doubleSolenoid(0, 1, Direction.EXTENDING);
    	Reactor = Strongback.switchReactor();
    }

    @Override
    public void teleopInit() {
        // Start Strongback functions ...
        Strongback.start();
    }

    @Override
    public void teleopPeriodic() {
    	Reactor.onTriggered(Operator.getButton(5), () -> Strongback.submit(new BucketExtendCommand(Bucket)));
    	Reactor.onTriggered(Operator.getButton(3), () -> Strongback.submit(new BucketRetractCommand(Bucket)));
    	
    	
    }

    @Override
    public void disabledInit() {
        // Tell Strongback that the robot is disabled so it can flush and kill commands.
        Strongback.disable();
    }

}

