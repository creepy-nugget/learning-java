import java.util.HashMap;
import java.util.Scanner;

class Hashmap1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array n:");
        int n =sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of arr:");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        HashMap< Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++) {
            int key = arr[i];
            mp.put(key,mp.getOrDefault(key,0)+1);
        }

        System.out.print("Enter the no. of queries q:");
        int q = sc.nextInt();

        System.out.print("Enter the queries:");
        while(q-- >0){
            int num = sc.nextInt();
            System.out.println(mp.getOrDefault(num, 0));
        }
    }
}
