/*
By sorting the best method will give time complexity of O(N*log N) and
space complexity depending upon sorting algorithm.
In this method TC:O(N) and SC:O(1)
 */

class Largestelmnt{
    int largest(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr ={8,5,87,9,87,99};
        Largestelmnt obj = new Largestelmnt();
        System.out.print(obj.largest(arr));
    }
}