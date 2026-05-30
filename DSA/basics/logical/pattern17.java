class solution17{
    public void pattern(int n){
        for(int i=0;i<=n;i++){
            for(int space=i;space<=n-1;space++){
                System.out.print(" ");
            }
            for(char ch ='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            if(i>=1){
                char ch =(char)('A'+i-1);
                for(int j=1;j<=i;j++){
                    System.out.print(ch--);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 15;
        solution17 sol = new solution17();
        sol.pattern(n);
    }
}