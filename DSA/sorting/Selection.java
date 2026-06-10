/*
----------------------------------------------------------------------------------------
Time Complexity:O(N^2)
Selection sort runs in O(N²) time in the best,average, and worst cases
due to its nested loop structure.
It makes approximately N(N-1)/2 comparisons, regardless of the array's initial state.
Even if no swaps are needed (best case), the number of comparisons remains the same.

Space Complexity: O(1).
No extra space used.
-----------------------------------------------------------------------------------------
*/

public class Selection{
    public void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
                int temp = arr[minindex];
                arr[minindex] = arr[i];
                arr[i] = temp;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args){
        int[] arr= {2,8,9,6,9,1,5,4};
        Selection obj = new Selection();
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        obj.sort(arr);
    }
}