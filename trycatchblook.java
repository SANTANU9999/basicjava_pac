package basicjava_pac;
import java.util.*;
public class trycatchblook {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c,d;
        System.out.println("enter the valu of a b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        try{
            d=a/(b-c);
            System.out.println("Div is "+ d);
        } catch(ArithmeticException e){
            System.out.println("b-c can not be zero");
        }
        
        System.out.println("Hallo this is santanu samanta");
        
    }
    
}
