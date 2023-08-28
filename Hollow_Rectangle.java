//Hollow Rectangle pattern
// *****
// *   *
// *   *
// *   *
// *****
import java.util.*;

public class Hollow_Rectangle {
    public static void HollowRectangle(int rows, int cols)
    {
        //outer loop
        for(int row =1; row<=rows;row++)
        {
            //inner-columns
            for (int col = 1; col <= cols; col++) {
                //cells - (row,column)
                if (row == 1 || row == rows || col == 1 || col == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        HollowRectangle(rows, cols);
    }
}
