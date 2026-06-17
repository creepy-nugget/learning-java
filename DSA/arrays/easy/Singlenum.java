class Singlenum{
    int sn(int[] arr){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor ^=arr[i];
        }
        return xor;
    }

    public static void main(String[] args){
        int[] arr={1,1,2,2,3,4,4,5,5};
        Singlenum obj = new Singlenum();
        System.out.print(obj.sn(arr));
    }
}