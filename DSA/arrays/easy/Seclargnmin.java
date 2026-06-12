class Seclargnmin{
    void sec(int[] arr){
        int n=arr.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }else if(arr[i]>smax && arr[i]!=max){
                arr[i]=smax;
            }
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }else if(arr[i]<smin && arr[i]!=min){
                smin=arr[i];
            }
        }
        System.out.print("Second largest element and smallest element are "+smax+","+smin);
    }

    public static void main(String[] args){
        int[] arr ={1,78,98,65,99,78,99};
        Seclargnmin obj = new Seclargnmin();
        obj.sec(arr);
    }
}