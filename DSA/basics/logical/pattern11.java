class solution11 {
    public void pattern(int n) {
        int k;
        for(int i=1;i<=n;i++){
            if(i%2==0) {
                k=0;
            }else{
                k=1;
            }
            for(int j=0;j<i;j++){
                System.out.print(k);
                k=1-k;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        solution11 sol = new solution11();
        sol.pattern(n);
    }
}
