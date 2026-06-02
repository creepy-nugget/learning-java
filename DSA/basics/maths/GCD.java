class GCD{
    public int gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b = b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }

    public static void main(String[] args){
        int a = 7;
        int b = 15;
        GCD d = new GCD();
        int div = d.gcd(a,b);
        System.out.print("GCD of "+a+","+b+" is "+div);
    }
}