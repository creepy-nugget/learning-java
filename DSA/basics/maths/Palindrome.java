class Palindrome{
    public boolean reverse(int n){
        int revno = 0;
        int temp = n;
        while(n>0){
            int ld = n%10;
            revno = revno*10+ld;
            n=n/10;
        }
        return (revno==temp);
    }

    public static void main(String[] args){
        int n = 14321;
        Palindrome rn = new Palindrome();
        if(rn.reverse(n)){
            System.out.print("The number"+" "+n+" "+"is palindrome");
        }else{
            System.out.print("The number"+" "+n+" "+"ain't palindrome");
        }
    }
}