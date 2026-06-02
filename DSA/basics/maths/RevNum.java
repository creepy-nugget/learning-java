class RevNum{
    public int reverse(int n){
        int revno = 0;
        while(n>0){
            int ld = n%10;
            revno = revno*10+ld;
            n=n/10;
        }
        return revno;
    }

    public static void main(String[] args){
        int n = 12345;
        RevNum rn = new RevNum();
        int reversed = rn.reverse(n);
        System.out.print(reversed);
    }
}