package basicjava_pac;
import java.util.*;
public class even_num_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        int r=0;
        System.out.println("Enter the How long you sum");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0){
                r=r+i;
            }
        }
        System.out.printf("So first %d Even Number Sum is = %d",n,r);
    }
}
