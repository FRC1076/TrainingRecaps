
public class MarioGameInstances {

    public static void main(String[] args) {
        // new MarioGames will create specific instances of the MarioGames class
        MarioGames smw = new MarioGames("Super Mario World", 72, false);
        MarioGames sm64 = new MarioGames("Super Mario 64", 120, true);
        // We can call functions just like before, but we have to 
        // specify which instance we want to call the function on
        // In this case, we want to get the time for Super Mario World, so we
        // do smw.getTimeToComplete()
        smw.numberOfLevels = 12;
        System.out.println(smw.getTimeToComplete());
    }

}
