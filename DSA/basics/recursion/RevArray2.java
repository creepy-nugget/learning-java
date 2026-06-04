class RevArray2{
    public void rev(int[] arr){
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        RevArray2 obj = new RevArray2();
        obj.rev(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}