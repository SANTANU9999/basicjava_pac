package basicjava_pac;
import java.util.*;
public class Multiplication_table_addition {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter numbar Which multipication Table You want To Addition");
    int a= sc.nextInt();
    int r=0;
    int s=1;
    for(int i=1;i<=a;i++){
        s=a*i;
        System.out.printf("%d *% d = %d\n",a,i,s);
        r=r+s;
    }
    System.out.printf("Addition of %d Multiplication Table Is = %d",a,r);
   } 
}
