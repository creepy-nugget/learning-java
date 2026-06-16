import java.util.Arrays;
class Rotate1 {
    //Left rotate
    public void left(int[] arr , int k){
        int n=arr.length;
        if(n<=1) return;

        k=k%n;
        int[] temp= Arrays.copyOfRange(arr,0,k);
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-n+k];
        }
    }
    //Right Rotate
    public void right(int[] arr,int k){
        int n = arr.length;
        if(n<=1) return;
        k=k%n;
        int[] temp = Arrays.copyOfRange(arr,n-k,n);
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        Rotate1 obj = new Rotate1();
        obj.left(arr1,3);
        obj.right(arr2,3);
        for(int num:arr1){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int num:arr2){
            System.out.print(num+" ");
        }
    }
}
