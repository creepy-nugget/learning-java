/*
________________________________________________________________________________________
Time Complexity: O(N^2), (where N = size of the array), for the worst, and average cases.
Space Complexity: O(1).
The best case occurs if the given array is already sorted.
We can reduce the time complexity to O(N) by just adding a small check inside the loops.
We will check in the first iteration if any swap is taking place.
If the array is already sorted no swap will occur and we will break out from the loops.
_________________________________________________________________________________________
 */

class Bubble{
    void sort(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            boolean didswap = false;
            for(int j=0;j<=i-1;j++){    // from j=0 to j<=i-1 , if till i then it will
                if(arr[j]>arr[j+1]){    // give runtime error , out of bound
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap= true;
                }
            }
            if(!didswap){
                break;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args){
        int[] arr = {6,7,8,7,3,6,1,5};
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        Bubble obj = new Bubble();
        obj.sort(arr);
    }
}