package HFJ.chp5;
public class simplestartuptd {
    public static void main(String[] args) {
        int numofguess = 0;
        gamehelper helper = new gamehelper();
        simplestartup go = new simplestartup();
        int randomnum = (int) (Math.random() * 5); // returns a random number from 0 to 4 (i.e., 0 - 4.999..,cast to an int).

        int[] locations = {randomnum, randomnum + 1, randomnum + 2};
        go.setlocationcells(locations);

        boolean isalive = true;

        while (isalive) {
            int guess = helper.getuserinput("enter a number");
            String result = go.checkyourselves(guess);
            numofguess++;
            if (result.equals("kill")) {
                isalive = false;
                System.out.println("You took " + numofguess + " guesses");
            }
        }
    }
}
