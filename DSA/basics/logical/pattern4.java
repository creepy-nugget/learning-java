class solution4{
    public void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        solution4 sol = new solution4();
        sol.pattern4(n);
    }
}