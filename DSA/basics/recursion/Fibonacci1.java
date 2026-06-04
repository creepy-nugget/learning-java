// To print whole series
class Fibonacci1 {
    public void fib(int n) {
        int[] fibo;
        if (n == 0) {
            System.out.print("0");
        } else if (n == 1) {
            System.out.print("0 1");
        } else {
            fibo = new int[n];
            fibo[0] = 0;
            fibo[1] = 1;
            for (int i = 2; i < n; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
            for (int i : fibo) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        Fibonacci1 obj = new Fibonacci1();
        obj.fib(n);
        }
}

