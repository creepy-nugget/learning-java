class Issorted{
    public boolean sorted(int[] arr){
        if(arr==null || arr.length<=1){
            return true;
        }
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr ={1,2,4,5,5,6,7};
        Issorted  obj = new Issorted();
        System.out.print(obj.sorted(arr) ? "Sorted":"Unsorted");
        //Function(Condition ? Value if True : Value if False) #TERNARY OPERATOR
    }
}