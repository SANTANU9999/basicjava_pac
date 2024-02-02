package basicjava_pac;
// Eligiblity chack if anay person age 18 and grater, or qulification is 12 abd grater, if any of them is true then He/She can Elegible for Enter the Root
import java.util.*;
import java.util.Scanner;

public class locicaloroperater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,q;
        System.out.println("Enter your Age ");
        r=sc.nextInt();
        System.out.println("Enter your Qulification");
        q=sc.nextInt();
        if(r>=18 || q>=12){           //Use logical or operater
            System.out.println("You are Elegible for Enter The Root");
        }
        else{
            System.out.println("You are not Elegible for Enter The Root");
        }
    }
}
