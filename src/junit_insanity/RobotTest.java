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
    }

}
