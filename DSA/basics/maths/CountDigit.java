public class CountDigit{
    public int count(int a){
        if(a==0) return 1;
        return (int) (Math.log10(a) + 1);
    }

public static void main(String[] args){
        int a =100;
        CountDigit cnt = new CountDigit();
        int digits = cnt.count(a);
        System.out.print(digits);
    }
}