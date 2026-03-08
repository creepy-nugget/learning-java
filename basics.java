public class basics {
    public static void main(String[] args){
        int x=1; // defining integer
        String name = "Hello world"; // defining string
        String[] name2 ={"This","is ","string", "array"}; //defining string array
        int[] x2 = {1,2,3,4,5}; // defining integer array

        System.out.print(x+"\n");// simple print
        System.out.println("New line here:"+name); // "ln" suffix at end means new line and "+" is used print the variable next to it

        //conditional statements
        int y = 22;
        if(y ==22){
            System.out.println("y is 22");
        } else if(y == 33){
            System.out.println("y is not 33");
        }else{
            System.out.println("last is else statement");
        }

        //looping statements
        int i =0;
        while(i<4){ //while loop
            i = i+1;
            System.out.print(x2[i]+",");
        }

        System.out.print("\n");

        for(int j=0;j<4;j++){ // for loop
            System.out.print(name2[j]+" ");
        }
    }
}