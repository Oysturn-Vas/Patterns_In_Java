import java.util.Scanner;

/*
12345
1234
123
12
1
*/

import java.util.*;

public class Inverted_Half_Pyramid_with_Numbers {
    public static void pattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int number = 1; number <= rows - i + 1; number++) {
                System.out.print(number);
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
