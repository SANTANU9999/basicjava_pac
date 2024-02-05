package basicjava_pac;
import java.util.*;
public class Recursion1_prac {
    static int i=0,j=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fun(7);
    }
    public static void fun(int num){
        if(num==0){
            
        }
        else{
           System.out.println("This Is Santau "+ i); 
           i++;
           fun(num-1);
           System.out.println("Samanta "+j);
           j++;
        }
    }
}
