class Linearsc{
    int lsearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6};
        Linearsc obj = new Linearsc();
        System.out.print(obj.lsearch(arr,4));
    }
}