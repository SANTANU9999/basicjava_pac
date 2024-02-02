package basicjava_pac;
import java.util.*;
public class factorial_using_loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter which Number You Want TOo Factorial");
        int a=sc.nextInt();
        int r=1;
        for(int i=1;i<=a;i++){
            r=r*i;
        }
        System.out.printf("Factorial of %d is = %d",a,r);
    }
}
