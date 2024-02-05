package basicjava_pac;
import java.util.*;
public class febonachi {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r;
        System.out.println("Enter How Many Number Y ou Want To See");
        r=sc.nextInt();
        int a=0,b=1,c; 
        System.out.println("The Fibonacci Serise Up To " + r+" Is ");
        System.out.print(a+" "+b+" ");
        for(int i=0;i<r;i++){
           c=a+b;
           a=b;
           b=c;
           System.out.print(c+" ");
        }
    }
}
