/*
1 
01
101
0101
10101
*/
import java.util.*;

public class zero_one_triangle {
    public static void pattern(int number)
    {
        //outer loop
        for(int row =1; row<=number;row++)
        {
            //inner-columns
            for (int col = 1; col <= row; col++) {
                //cells - (row,column)
                if ((row + col) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
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
