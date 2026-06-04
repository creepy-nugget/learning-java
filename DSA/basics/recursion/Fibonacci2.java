//To print Nth term
//series starting from 1
class Fibonacci2 {
    public void fib(int n) {
        if(n<=1) {
            System.out.print(n);
        }else{
            int fslast=0;
            int flast =1;

            int fibo=0;
            for(int i=2; i<=n;i++){
                fibo = flast+fslast;
                fslast = flast;
                flast = fibo;
            }
            System.out.print(fibo);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        Fibonacci2 obj = new Fibonacci2();
        obj.fib(n);
    }
}

