package basicjava_pac;

import java.util.*;

public class fibonacci_using_recursion {
    static int a = 0, b = 1, c, s = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("Enter How Many Number Y ou Want To See");
        r = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.println("The Fibonacci Serise Up To " + r + " Is ");
        System.out.print(a + " " + b + " ");
        fun(r - 2);
    }

    public static void fun(int r) {

        if (r == 0) {

        } else {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            fun(r - 1);
        }
    }
}
