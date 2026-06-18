class maxconsec1{
    int maxones(int[] arr){
        int cnt=0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                count=0;
            }
            cnt=Math.max(cnt,count);
        }
        return cnt;
    }

    public static void main(String[] args){
        int[] arr={1,0,1,1,1,0,0,1};
        maxconsec1 obj = new maxconsec1();
        System.out.print(obj.maxones(arr));
    }
}