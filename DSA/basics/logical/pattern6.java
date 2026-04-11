class solution6{
    public void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(n-j+1);
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        int n = 5;
        solution6 sol = new solution6();
        sol.pattern6(n);
    }
}