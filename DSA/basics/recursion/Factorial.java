class Factorial{
    public int fact(int n){
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args){
        int n =6;
        Factorial pnt = new Factorial();
        int s =pnt.fact(n);
        System.out.print(s);
    }
}