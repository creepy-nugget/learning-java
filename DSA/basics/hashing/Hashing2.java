import java.util.Scanner;
// Hashing lowercase( use 'a' as reference) and uppercase( use 'A' as reference) alphabets.
class Hashing2{
    public static void main(String[] args){
        System.out.print("Enter any string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //precomputing
        int[] hash = new int[26]; // 26 alphabets
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)-'A'] += 1; //Using ASCII value of 'a' that is 97 as reference value for other alphabets.
        }

        //fetching
        System.out.print("Enter no. of queries:");
        int q = sc.nextInt();
        System.out.print("Enter the queries:");
        while(q-- >0){
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch-'A']);
        }
    }
}