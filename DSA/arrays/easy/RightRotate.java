class RightRotate{
    void right(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            arr[arr.length-1-i]=arr[arr.length-2-i];
        }
        arr[0]=temp;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        RightRotate obj = new RightRotate();
        obj.right(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}