class solution5{
public void pattern5(int n){
    for(int i=n;i>0;i--){
        for(int j=i;j>0;j--){
            System.out.print("*");
        }
        System.out.println();

    }
}
public static void main(String[] args){
    int n = 5;
    solution5 sol = new solution5();
    sol.pattern5(n);
}
}