class SumofN{
    public int prnt(int n){
        if (n == 1) {
            return 1;
        }
        return n + prnt(n - 1);
    }

    public static void main(String[] args){
        int n =6;
        SumofN pnt = new SumofN();
        int s =pnt.prnt(n);
        System.out.print(s);
    }
}