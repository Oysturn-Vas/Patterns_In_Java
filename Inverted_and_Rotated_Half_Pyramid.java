/*     
    *
   **
  ***
 ****
*****
*/

import java.util.*;

public class Inverted_and_Rotated_Half_Pyramid {
    public static void pattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            //spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            //stars
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        pattern(rows);
    }
}
