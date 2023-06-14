package codingBat;

import java.util.Scanner;

public class GuessNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNo = 7;
        int guess = 0;
//        do {
//            System.out.print("Guess: ");
//            if (sc.hasNext()) {
//                guess = sc.nextInt();
//            }
//        } while (secretNo != guess);
//        System.out.println("You guessed it!");
        sc.hasNext();
        System.out.println(sc.next());
    }
}
