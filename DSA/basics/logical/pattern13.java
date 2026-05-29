class solution13{
    public void pattern(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n=5;
        solution13 sol = new solution13();
        sol.pattern(n);
    }
}