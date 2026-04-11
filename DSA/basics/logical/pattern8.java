class solution8{
    public void pattern8(int n){
        for(int i=n;i>0;i--){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 5;
        solution8 sol = new solution8();
        sol.pattern8(n);
    }
}