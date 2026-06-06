import java.util.Scanner;

class Hashing3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string:");
        String s = sc.next();

        //precomputing
        int[] hash = new int[256]; // There are in total 256 characters with their specific ASCII value.
        for(int i=0; i< s.length();i++){
            hash[s.charAt(i)] += 1;
        }

        //fetching
        System.out.print("Enter no. of queries:");
        int q = sc.nextInt();
        System.out.print("Enter the queries:");
        while(q-- > 0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c]);
        }
    }
}