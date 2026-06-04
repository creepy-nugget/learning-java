class PrintNto1{
    public void prnt(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        n--;
        prnt(n);
    }

    public static void main(String[] args){
        int n =10;
        PrintNto1 pnt = new PrintNto1();
        pnt.prnt(n);
    }
}