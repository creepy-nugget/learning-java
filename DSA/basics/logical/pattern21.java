class solution21{
    public void pattern(int n){
        for(int i=1;i<=n;i++){
            System.out.print('*');
        }
        System.out.println();
        for(int i=1;i<=n-2;i++){
            System.out.print('*');
            for(int space=1;space<=n-2;space++){
                System.out.print(" ");
            }
            System.out.print('*');
            System.out.println();
        }
        for(int i=1;i<=n;i++) {
            System.out.print('*');
        }
    }

    public static void main(String[] args){
        int n=4;
        solution21 sol = new solution21();
        sol.pattern(n);
    }
}