import java.util.ArrayList;
import java.util.List;

public class Merge{
    public void merge(int[] arr, int low ,int mid ,int high){
        List<Integer> temp = new ArrayList<>();
        int left =low;
        int right=mid+1;
        // Add elements to empty temp array
        while(left<=mid && right<=high){   //compares both sorted array
            if(arr[left]<arr[right]){      //for smaller element and appends
                temp.add(arr[left++]);     // it to temp, if [left] is bigger then
            }else temp.add(arr[right++]);  // appends element at [right] index
        }

        // Elements can be still left to be added in temp
        // if size of [left]->[mid] array is bigger than,
        // array [right=mid+1]->[high].In this case left array will be left some elements.
        // Vice versa if right part is bigger than left.

        while(left<=mid){        //if left part is bigger than right part.
            temp.add(arr[left++]);
        }
        while(right<=high){      //if right part is bigger than left part.
            temp.add(arr[right++]);
        }

        //Now that we have sorted array in temp,we need to copy that in og arr.
        for (int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);      //like array with 0 to 14 indexes
        }                                    //dividing it to low and high after recursion will
    }                                        //lead to a part w/ low=8,high=14.
                                             //In this instance to copy the sorted element to these specific index low,
                                             //high of og array we use (i-low) here.
    void ms(int[] arr,int low,int high){
        //base case when low==high i.e when we have reached a sole single element by recursion again n again.
        if(low >= high) return;
        //find mid of array
        int mid = (low+high)/2;
        //sort left side
        ms(arr,low,mid);
        //sort right side
        ms(arr,mid+1,high);
        //merge both half
        merge(arr,low,mid,high);
    }

    public static void main(String[] args){
        int[] arr = {1,3,4,5,2,6,8};
        Merge obj = new Merge();
        obj.ms(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}