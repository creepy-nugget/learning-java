class solution19{
    public void pattern(int n){
        for(int i=1;i<=n;i++) {
            for (int j = i; j <= n; j++) {
                System.out.print('*');
            }
            for (int space = 1; space < i; space++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            for (int space = i; space < n; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 5;
        solution19 sol = new solution19();
        sol.pattern(n);
    }
}