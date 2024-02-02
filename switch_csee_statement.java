package basicjava_pac;

import java.util.*;

public class switch_csee_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, c;
        System.out.println("Enter any two Number");
        a = sc.nextInt();
        c = sc.nextInt();
        int b,s;
        do{
        System.out.println(
                "If you want to add then prass 1, if you want to subtraction then prass 2 , if you want to multification then tenn press 4 and if you want to divisen then press 5");
        b = sc.nextInt();
        switch (b) {
            case 1:
                System.out.printf("Sum Of %d and %d Is = %d ", a, c, a + c);
                break;
            case 2:
                System.out.printf("Subtarction Of %d and %d Is = %d ", a, c, a - c);
                break;
            case 4:
                System.out.printf("Multiplication Of %d and %d Is = %d ", a, c, a * c);
                break;
            case 5:
                if (c != 0) {
                    System.out.printf("Divition Of %d and %d Is = %d ", a, c, a / c);
                } else {
                    System.out.println("Divition is not possible");
                }
                break;
            default:
                System.out.println("Enter the Right valu");
                break;
            }
            System.out.println("\nTo continue the loop is enter 8 and exit the loop");
            s=sc.nextInt();
        }while(s==8);
    }

}
