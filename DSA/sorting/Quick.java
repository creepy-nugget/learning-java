/*
Partitioning the array around a pivot element such that all elements smaller
than the pivot lie to its left and all greater elements lie to its right.
This positioning ensures that the pivot is in its correct sorted place.

Time Complexity: O(N*logN), At each step, we divide the whole array,
for that we take logN time and n steps are taken for the partitioning.
In worst case i.e. when our pivot is always the greatest or the smallest element of the array,
the time complexity can be O(N^2).

Space Complexity: O(N),in worst case auxiliary stack space.
Best and avg case takes O(log N)
 */

class Quick{
    void qs(int[] arr,int low,int high){
        if(low<high){
            int pivotindex = partition(arr,low,high);
            qs(arr,low,pivotindex-1);
            qs(arr,pivotindex+1,high);
        }
    }
    private int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        // Initialize i
        int i = low - 1;
        // Traverse from low to high-1
        for (int j = low; j < high; j++) {
            // If element <= pivot
            if (arr[j] <= pivot) {
                // Increment i and swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        // Return pivot index
        return i + 1;
    }

    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,2,4,6,8};
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        Quick obj = new Quick();
        obj.qs(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}