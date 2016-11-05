package junit_insanity;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {
    // Tolerance for decimal values (usually 10^-9)
    static final double EPSILON = 1E-9;
    
    @Test
    public void testUpdate() {
        Robot robot = new Robot(0.0, 0.0, 10.0, -5.0);
        robot.update();
        // assertEquals("Message about what should happen", expectedValue, valueToTest, tolerance)
        assertEquals("Robot should move", 10.0, robot.xPosition, EPSILON);
        assertEquals("Robot should move", -5.0, robot.yPosition, EPSILON);
        
        robot.update();
        assertEquals("Robot should move twice as far", 20.0, robot.xPosition, EPSILON);
        assertEquals("Robot should move twice as far", -10.0, robot.yPosition, EPSILON);
        
        
//        return isAlive == false;
    }
    
    @Test
    public void testDriveToPoint() {
        Robot robot = new Robot(-5, -6, 0, 0);
        robot.driveToPoint(0.0, 0.0);
        assertEquals("Robot should have enough x velocity to get to the point next update",
                5.0, robot.xVelocity, EPSILON);
        assertEquals("Robot should have enough y velocity to get to the point next update",
                6.0, robot.yVelocity, EPSILON);
        
        robot.update();
        assertEquals("Robot should be at origin", 0.0, robot.xPosition, EPSILON);
        assertEquals("Robot should be at origin", 0.0, robot.yPosition, EPSILON);
                
    }

}
