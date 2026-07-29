class Longsubarr{
    int subarr1(int[] arr , int k){
        int n=arr.length;
        int maxlen=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if (sum == k){
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args){
        int[] arr1 ={10, 5, 2, 7, 1, 9};
        int k1=15;

        int[] arr2={-3, 2, 1};
        int k2=6;

        Longsubarr obj = new Longsubarr();
        System.out.print(obj.subarr1(arr1,k1));
//        System.out.println();
//        System.out.print(obj.subarr2(arr2,k2));
   }
}