class solution3{
    public void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        solution3 sol = new solution3();
        sol.pattern3(n);
    }
}