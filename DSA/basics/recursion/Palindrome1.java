class Palindrome1{
    public boolean palin(String s){
        int p1=0,p2=s.length()-1;
        while(p1<p2){
            if (!Character.isLetterOrDigit(s.charAt(p1)))
                p1++;
            else if (!Character.isLetterOrDigit(s.charAt(p2)))
                p2--;
            else if (Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2)))
                return false;
            else {
                p1++;
                p2--;
            }
        }
        return true;
        }

    public static void main(String[] args){
        String s = "ABCDCBA";
        Palindrome1 obj = new Palindrome1();
        if(obj.palin(s)){
            System.out.print("The string,"+s+" is a palindrome.");
        }else{
            System.out.print("The string,"+s+" ain't a palindrome.");
        }
    }
}