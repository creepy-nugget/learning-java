class solution1 {
     public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution1 sol = new solution1();
        int N = 5;
        sol.pattern1(N);
    }
}

