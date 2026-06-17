class Rotate2{
    public void reverse(int[]arr ,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void left(int[] arr,int k){
        if(arr.length<=1||arr==null) return;
        k=k%arr.length;
        if(k==0) return;
        reverse(arr,0,arr.length-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-k-1);
    }

    public void right(int[] arr,int k){
        if(arr.length<=1||arr==null) return;
        k=k%arr.length;
        if(k==0) return;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }

// GIVEN THAT ARRAYS ARE NOT POINTING TO NULL
    public static void main(String[] args){
        int[] a1={1,2,3,4,5};
        int[] a2={6,7,8,9,10};
        Rotate2 obj = new Rotate2();
        obj.left(a1,2);
        obj.right(a2,3);
        for(int num:a1) System.out.print(num+" ");
        System.out.println();
        for(int num:a2) System.out.print(num+" ");
    }
}