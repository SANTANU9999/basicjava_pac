package basicjava_pac;
import java.util.*;
public class else_if {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double a;
    System.out.println("Enter your Salary");
    a=sc.nextInt();
    if(a>=250000 && a<=500000 ){
        System.out.printf("Your Salary is Besd on Your Salary You Pay 5% Tax ");
    }
    else if(a>=500000 && a<=1000000){
        System.out.printf("Your Salary is Besd on Your Salary You Pay 20% Tax ");
    }
    else if(a>=1000000){
        System.out.printf("Your Salary is Besd on Your Salary You Pay 30% Tax ");
    }
    else if(a<=250000){
        System.out.println("Yo Do not pay Any Tax");
    }
}
}
