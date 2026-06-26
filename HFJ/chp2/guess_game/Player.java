package guess_game;

import java.util.Scanner;
class Player{
    int number;
    void guess(){
        Scanner sc = new Scanner(System.in);
        number= sc.nextInt();
    }
}