package basicjava_pac;
import java.util.*;
public class while_loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number ");
        int s=sc.nextInt();
        int i=0;
        int r=0;
        while(i<s){
            r=r+i;
            i+=1;
        }
        System.out.printf("First %d Number Addition Is = %d",s,r);
    }
}
