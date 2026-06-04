class Print1toN{
    public void prnt(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        i++;
        prnt(i,n);
    }

    public static void main(String[] args){
        int n =10;
        Print1toN pnt = new Print1toN();
        pnt.prnt(1,n);
    }
}