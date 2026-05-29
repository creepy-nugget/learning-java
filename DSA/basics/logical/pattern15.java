class solution15{
    public void pattern(int n){
        for(int i=n-1;i>=0;i--){
            for(char ch = 'A'; ch <= 'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n=5;
        solution15 sol = new solution15();
        sol.pattern(n);
    }
}