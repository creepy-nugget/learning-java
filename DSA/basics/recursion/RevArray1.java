class RevArray1{
    public int[] rev(int[] arr){
        int n = arr.length;
        int[] reverse = new int[n];
        for(int i=0;i<n;i++){
            reverse[i]=arr[n-1-i];
        }
        return reverse;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        RevArray1 obj = new RevArray1();
        for(int i:obj.rev(arr)){
            System.out.print(i+" ");
        }
    }
}