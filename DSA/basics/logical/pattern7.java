class solution7{
    public void pattern7(int n){
        for(int i=1;i<=n;i++){
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
        solution7 sol = new solution7();
        sol.pattern7(n);
    }
}