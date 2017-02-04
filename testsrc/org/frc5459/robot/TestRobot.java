/* Created Sat Jan 14 09:56:00 EST 2017 */
package org.frc5459.robot;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;
import org.strongback.mock.Mock;
import org.strongback.mock.MockGyroscope;
import org.strongback.mock.MockSolenoid;

@Ignore
public class TestRobot {
	private MockSolenoid MockBucket;

	@Ignore
	@Test
	public void shouldExtendWhenAlreadyExtended(){
	    MockSolenoid solenoid = Mock.manualSolenoid().extend();
	    System.out.println("Solenoid created");
	    BucketExtendCommand command = new BucketExtendCommand(solenoid);
	    System.out.println("Command created");
	    assertThat(solenoid.isExtending()).isTrue();
	    assertThat(solenoid.isRetracting()).isFalse();
	    assertThat(command.execute()).isTrue();
	    solenoid.stop();
	    assertThat(solenoid.isStopped()).isTrue();
	    System.out.println("shouldExtendWhenAlreadyExtended passed");
	}
	@Ignore
	@Test
	public void shouldExtendWhenRetracted(){
        MockSolenoid solenoid = Mock.manualSolenoid().retract();
        System.out.println("Solenoid created");
        BucketExtendCommand command = new BucketExtendCommand(solenoid);
        System.out.println("Command created");
        assertThat(solenoid.isExtending()).isTrue();
        assertThat(solenoid.isRetracting()).isFalse();
        assertThat(command.execute()).isTrue();
        solenoid.stop();
        assertThat(solenoid.isStopped()).isTrue();   
        System.out.println("shouldExtendWhenRetracted passed");
	}
	@Ignore
	@Test
	public void shouldRetractWhenAlreadyExtended(){
	    MockSolenoid solenoid = Mock.manualSolenoid().extend();
	    System.out.println("Solenoid created");
	    BucketRetractCommand command = new BucketRetractCommand(solenoid);
	    System.out.println("Command created");
	    assertThat(command.execute()).isTrue();
	    System.out.println(solenoid.isRetracting());
	    assertThat(solenoid.isRetracting()).isTrue();
	    assertThat(solenoid.isExtending()).isFalse();
	    
	    
	    solenoid.stop();
	    assertThat(solenoid.isStopped()).isTrue();
	    System.out.println("shouldRetractWhenAlreadyExtended passed");
	}
	@Ignore
	@Test
	public void shouldRetractWhenRetracted(){
        MockSolenoid solenoid = Mock.manualSolenoid().retract();
        System.out.println("Solenoid created");
        BucketRetractCommand command = new BucketRetractCommand(solenoid);
        System.out.println("Command created");
        solenoid.retract();
        assertThat(command.execute()).isTrue();
        System.out.println(solenoid.isRetracting());
        assertThat(solenoid.isExtending()).isFalse();
        assertThat(solenoid.isRetracting()).isTrue();
        
        solenoid.stop();
        assertThat(solenoid.isStopped()).isTrue();   
        System.out.println("shouldRetractWhenRetracted passed");
	}
	
	public void Drive5459test(){
		MockGyroscope gyro;
	//	MockTalonController right;
	//	Drive5459 Test = new Drive5459();
	}
    	
	
}
