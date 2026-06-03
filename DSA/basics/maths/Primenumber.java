class Primenumber{
    boolean prime( int n){
        int cnt = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                cnt++;
                if(n/i!=i){
                    cnt++;
                }
            }
        }
        return(cnt==2);
    }

    public static void main(String[] args){
        int n = 78;
        Primenumber pn = new Primenumber();
        if(pn.prime(n)){
            System.out.print(n+" is a prime number.");
        }else{
            System.out.print(n+" ain't a prime number.");
        }
    }
}