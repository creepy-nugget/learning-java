class solution14{
    public void pattern(int n){
        for(int i=0;i<n;i++){
            for(char ch = 'A'; ch <= 'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        int n=5;
        solution14 sol = new solution14();
        sol.pattern(n);
    }
}