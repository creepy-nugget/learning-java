package HFJ.chp5;
import java.util.Scanner;
public class gamehelper {
    public int getuserinput(String prompt) {    // a program to take input from user as int
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}