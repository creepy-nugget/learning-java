package HFJ.chp5;
public class simplestartup {
    private int[] locationcells;
    private int numofhits = 0;

    public void setlocationcells(int[] locs){
        locationcells = locs;
    }
    public String checkyourselves(int guess){
        String result = "miss";
        for(int cells : locationcells){
            if (guess == cells){
                result = "hit";
                numofhits++;
                break;
            }
        }
        if(numofhits == locationcells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}