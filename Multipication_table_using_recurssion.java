package basicjava_pac;
import java.util.*;
public class Multipication_table_using_recurssion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Enter Which Number Multiplication Table You Want ");
    }
    public static int fun(int num){
        Scanner sc= new Scanner(System.in);
        
        if(num==0){
            return 1;
        }
        else{
            return num+fun(num-1);
        }
        
    }
}
