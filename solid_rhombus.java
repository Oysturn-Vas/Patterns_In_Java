/*  
    *****
   ***** 
  *****
 *****
*****
*/

import java.util.*;
public class solid_rhombus {
    public static void pattern(int number)
    {
        //outer loop
        for(int row =1; row<=number;row++)
        {
            //inner spaces
            for (int space = 1; space <= number - row; space++) {
                System.out.print(" ");
            }

            //inner stars
            for (int star = 1; star <= number; star++) {
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
