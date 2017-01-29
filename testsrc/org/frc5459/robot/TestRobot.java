/* Created Sat Jan 14 09:56:00 EST 2017 */
package org.frc5459.robot;


import org.fest.assertions.Assertions;


import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;
import org.strongback.mock.Mock;
import org.strongback.mock.MockMotor;

public class TestRobot {
	private MockMotor motor;
	//for AscendClimbCommand
    @Test
    public void shouldAscendWhenAscending() {
       motor = Mock.stoppedTalonSRX();
       System.out.println("motor created");
       AscendClimbCommand command = new AscendClimbCommand(motor);
       System.out.println("Command Created");
       double speed = motor.getSpeed();
       //assertions
       Assertions.assertThat(speed == 0.0).isTrue();
       assertThat(command.execute()).isTrue();
       speed = motor.getSpeed();
       assertThat(speed == 1.0).isTrue();
       motor.stop();
       speed = motor.getSpeed();
       assertThat(speed == 0.0).isTrue();
       System.out.println("shouldAscendingWhenAscending passed");
    }
    //for StopClimbCommand
    @Test
    public void shouldStopWhenStopped(){
    	motor = Mock.stoppedTalonSRX();
        System.out.println("motor created");
        StopClimbCommand command = new StopClimbCommand(motor);
        System.out.println("Command Created");
        double speed = motor.getSpeed();
        //assertions
        Assertions.assertThat(speed == 0.0).isTrue();
        assertThat(command.execute()).isTrue();
        assertThat(speed == 0.0).isTrue();
        motor.stop();
        assertThat(speed == 0.0).isTrue();
        System.out.println("shouldStopWhenStopped passed");
    }
}
