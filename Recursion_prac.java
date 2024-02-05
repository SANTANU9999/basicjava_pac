package basicjava_pac;

import java.util.*;

public class Recursion_prac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.print("Enter Number = ");
        s = sc.nextInt();
        int z = factorial(s);
        System.out.println(z);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}