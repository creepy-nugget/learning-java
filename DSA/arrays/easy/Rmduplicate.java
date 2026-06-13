class Rmduplicate{
    public int duplicate(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,3,4,4,4,5,6,7};
        Rmduplicate obj = new Rmduplicate();
        int k =obj.duplicate(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}