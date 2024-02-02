package basicjava_pac;
import java.util.*;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbar Which multipication Table You want TO show");
        int a=sc.nextInt();
        System.out.println("Multipication Table of "+ a +" Is");
        for(int i=1;i<=10;i++){
            System.out.printf("%d *% d = %d\n",a,i,a*i);
        }
    }
}
