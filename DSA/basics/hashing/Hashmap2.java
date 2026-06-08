import java.util.HashMap;
import java.util.Scanner;

class Hashmap2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s =sc.next();

        HashMap< Character , Integer> mp = new HashMap<>();

        System.out.print("Enter the elements of arr:");
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            // the keys here won't be converted into integer,stored as assigned character only.
            mp.put(key,mp.getOrDefault(key,0)+1);
        }

        System.out.print("Enter the no. of queries q:");
        int q = sc.nextInt();

        System.out.print("Enter the queries:");
        while(q-- >0){
            char c = sc.next().charAt(0);
            System.out.println(mp.getOrDefault(c, 0));
        }
    }
}
