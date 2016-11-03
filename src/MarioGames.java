
public class MarioGames {
    // These are field variables. They are contained inside
    // of instances of the class
    String titleOfGame;
    int numberOfLevels;
    boolean is3D;
    
    // This is a constructor (you can more than one)
    // These allow you create a new instance of the class
    public MarioGames(String titleOfGame, int numberOfLevels, boolean is3D) {
        this.titleOfGame = titleOfGame;
        this.numberOfLevels = numberOfLevels;
        this.is3D = is3D;
    }

    // You can still make functions inside of a class
    public int getTimeToComplete() {
        // one level is ten minutes long
        int totalTime = numberOfLevels * 10;
        if (is3D) {
            // if it's 3d then it take twice as long because its harder
            totalTime = totalTime * 2;
        }
        
        return totalTime;
    }
}

// time per p = total / periods
