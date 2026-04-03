package HFJ.chp5;

public class simplestartuptd{
    public static void main ( String [] args){
        simplestartup dot = new simplestartup();

        int[] locations = {2,3,4};
        dot.setlocationcells(locations);

        int userguess = 2;
        String result = dot.checkyourselves(userguess);
        String testresult = "failed";
        if(result.equals("hit")){
            testresult = "passed";
        }
        System.out.println(testresult);
    }
}