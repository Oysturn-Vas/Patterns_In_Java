/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
*/

import java.util.*;

public class butterfly {
    public static void pattern(int number)
    {
        //top half
        for (int i = 1; i <= number; i++) {
            //left star
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            //spaces inbetween
            for (int space = 1; space <= 2 * (number - i); space++) {
                System.out.print(" ");
            }
            //right star
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //bottom half
        for (int i = number; i > 0; i--) {
            //left star
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            //spaces inbetween
            for (int space = 1; space <= 2 * (number - i); space++) {
                System.out.print(" ");
            }
            //right star
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        pattern(number);
    }
    
}
