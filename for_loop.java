package basicjava_pac;
//revars peramid
import java.util.*;
public class for_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.println("Enter a Number");
        r=sc.nextInt();
        for(int i=r;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        } 
    }
}
