class Solution22 {
    public void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int bottom = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - minDist) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution22 sol = new Solution22();
        int n = 5;
        sol.pattern22(n);
    }
}
