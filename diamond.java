/*
   *  
  *** 
 *****
*******
*******
 *****
  ***
   *
*/
import java.util.*;

public class diamond {
    public static void pattern(int number)
    {
        //top half
        for (int i = 1; i <= number; i++) {
            //spaces
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }

            //star
            for (int star = 1; star <= (2 * i)-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //bottom half
        for (int i = number; i > 0; i--) {
            //spaces
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }

            //star
            for (int star = 1; star <= (2 * i)-1; star++) {
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
