import java.util.Scanner;
// Hashing numbers
class Hashing1{
    public static void main(String[] args){

        // input array of size n and int elements in it by for loop using scanner.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array in accordance to the size of array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // the elements in arr are considered to be between 1 and 12.
        int[] hash = new int[13]; // as 12 elements in arr , so we define hash array of size 12+1 to iterate it using loop.
        for(int i=0;i<n;i++){
            hash[arr[i]] += 1;   // precomputing process
        }

        //for fetching
        System.out.print("Enter no. of query:");
        int q = sc.nextInt();
        System.out.print("Enter the queries:");
        while( q-- > 0){
            int num = sc.nextInt();
            System.out.println(hash[num]);
        }
    }
}