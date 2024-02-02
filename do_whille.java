package basicjava_pac;
import java.util.*;
public class do_whille {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s;
       
        do{
            System.out.println("This is My Program");
            System.out.println("To continue This loop Enter 4 and To Exit Enter Any Key");
             s=sc.nextInt();
        }while(s==4);
    }
}
