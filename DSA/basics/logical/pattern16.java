class solution16 {
    public void pattern(int n) {
        for (char ch = 'A'; ch <= 'A' + n; ch++) {
            for (char cha = 'A'; cha <= ch; cha++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n=5;
        solution16 sol = new solution16();
        sol.pattern(n);
    }
}


