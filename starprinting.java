package basicjava_pac;
import java.util.*;
public class starprinting {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for (int j=0;j<=i;j++)
            {
            System.out.print(" * ");
            
            }
            System.out.println(" ");
            
        }
    }    
    
}
