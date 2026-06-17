class Missingnum{
    // Optimal using sum of n numbers property. {O(n) and O(1)}
    int missing1(int[] arr){
        if(arr.length<=1) return -1;
        int n = arr.length+1;
        n=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            n-=arr[i];
        }
        return n;
    }
    // Bruteforce. {O(n^2) and O(1)}
    int missing2(int[] arr){
        if(arr.length<=1) return -1;
        for(int i=1;i<=arr.length+1;i++){
            boolean found=false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    found = true;
                    break;
                }
            }
            if(!found) return i;
        }
        return -1;
    }
    // Optimal using XOR Op. {O(n) and O(1)}
    int missing3(int[] arr){
        if(arr.length<=1) return -1;
        int xor1 =0;
        int xor2 =0;
        for(int i=1;i<=arr.length+1;i++){
            xor1 ^=i;
        }
        for(int i=0;i<arr.length;i++){
            xor2^=arr[i];
        }
        return xor1^xor2;
    }

    public static void main(String[] args){
        int[] arr1={1,2,3,4,6,7,8,9};
        int[] arr2={1,2,3,4,5,6,8,9};
        int[] arr3={1,3,4,5,6,7,8,9};
        Missingnum obj = new Missingnum();
        System.out.print(obj.missing1(arr1));
        System.out.println();
        System.out.print(obj.missing2(arr2));
        System.out.println();
        System.out.print(obj.missing3(arr3));
    }
}