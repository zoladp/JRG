package roz05;

public class PomieszanePetleFor {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int zewn = 0; zewn < 3; zewn++) {
            for (int wewn = 4; wewn > 1; wewn--) {
/*                x+=3;
                x+=6;
                x+=2;
                x++;
                x--;
                x = x+0;*/
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}
