package junit_insanity;

/**
 * A _very_ simplified version of a robot
 */
public class Robot {
    double xPosition;
    double yPosition;
    double xVelocity;
    double yVelocity;
    
    public Robot(double xPosition, double yPosition, double xVelocity, double yVelocity) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.xVelocity = xVelocity;
        this.yPosition = yVelocity; // This used to be this.yPosition = yVelocity, which was caught in our tests!
    }
    
    public String toString() {
        return "Currently at (" + xPosition + ", " + yPosition + ")";
    }
    
    // Update robot position. In real life we would be provided a function that is called every few milliseconds
    public void update() {
        this.xPosition += this.xVelocity;
        this.yPosition += this.yVelocity;
    }
}
