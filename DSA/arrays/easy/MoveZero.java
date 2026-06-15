class MoveZero{
    public void mvzero(int[] arr){
        if(arr.length<=1 || arr==null) return;
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,0,3,0,5,0,6};
        MoveZero obj = new MoveZero();
        obj.mvzero(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}