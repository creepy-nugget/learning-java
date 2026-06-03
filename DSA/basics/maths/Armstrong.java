class Armstrong{
    public boolean arm(int n){
        int num=0;
        int temp =n;
        if(n==0) return (true);
        int digits = (int) (Math.log10(n) + 1);
        while(n>0){
            int ld=n%10;
            num = num+(int)Math.pow(ld,digits);
            n=n/10;
        }
        return(temp==num);
    }

    public static void main(String[] args){
        int n = 153;
        Armstrong an = new Armstrong();
        if(an.arm(n)){
            System.out.print("The number "+n+" is Armstrong.");
        }else{
            System.out.print("The given number "+n+" ain't Armstrong");
        }
    }
}