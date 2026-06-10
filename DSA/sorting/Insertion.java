/*
__________________________________________________________________________________________
Time Complexity: O(N^2), (where N = size of the array), for the worst, and average cases.
Space Complexity: O(1).
The best case i.e O(N) occurs if the given array is already sorted,in this case while loop
will not even iterate for even once as arr[j-1]>arr[j] case will always be false.
__________________________________________________________________________________________
 */

class Insertion{
    public void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args){
        int[] arr ={1,3,5,6,8,2,4,7};
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        Insertion obj = new Insertion();
        obj.sort(arr);
    }
}