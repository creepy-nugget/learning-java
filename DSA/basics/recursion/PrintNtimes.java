class PrintNtimes{
    public void prnt(String name ,int n){
        if(n==0){
            return;
        }
        System.out.println(name);
        n--;
        prnt(name,n);
    }

    public static void main(String[] args){
        int n =10;
        String name = "Nugget";
        PrintNtimes pnt = new PrintNtimes();
        pnt.prnt(name,n);
    }
}