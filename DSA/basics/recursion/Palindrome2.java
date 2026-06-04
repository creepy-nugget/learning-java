class Palindrome2{
    public boolean palin(int i,String s) {
        if (i >= s.length() / 2) return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return palin(i + 1, s);
    }

    public static void main(String[] args){
        String s = "ABCDCBA";
        Palindrome2 obj = new Palindrome2();
        if(obj.palin(0,s)){
            System.out.print("The string,"+s+" is a palindrome.");
        }else{
            System.out.print("The string,"+s+" ain't a palindrome.");
        }
    }
}