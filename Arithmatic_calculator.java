package basicjava_pac;
import java.util.*;
public class Arithmatic_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        do {
            operater c = new operater();
            System.out.println(
                    "if you want to add then prass 1,\nif you want to subtraction then prass 2,\nif you want to multification then tenn press 4,\nif you want to divisen then press 5,\nif you want to modulo then tenn press 6");
            b = sc.nextInt();
            switch (b) {
                case 1:
                    c.addition();
                    break;
                case 2:
                    c.subtraction();
                    break;
                case 4:
                    c.multipliction();
                    break;
                case 5:
                    c.devition();
                    break;
                case 6:
                    c.modulo();
                    break;
                default:
                    System.out.println("Enter the exti valu");
                    break;
            }
            System.out.println(
                    "Enter 3 if you cuntinued this processs and enter any key with out 3 to termenate this process");
            a = sc.nextInt();
        } while (a == 3);
    }
}
class operater{
    public void addition(){
        Scanner sc= new Scanner(System.in);
        int r;
        System.out.println(("Enter how many number you want to addition"));
        r=sc.nextInt();
        float arr[]=new float[r];
        float result =0;
        System.out.println("Enter numbers");
        for(int i=0;i<r;i++){
            arr[i]=sc.nextFloat();
        }
        for(int i=0;i<r;i++){
            result +=arr[i];
        }
        System.out.println("Addition of all number is "+ result);
    }
    public void subtraction() {
        Float a, c, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbaer which you want to subtraction");
        a = sc.nextFloat();
        c = sc.nextFloat();
        result = a - c;
        System.out.println("subtraction of " + a + " " + " and " + c + " is " + " " + result);
        System.out.printf("subtraction of %f  " + " and %f  upto two point is " + " " +"%.2f" ,a,c,result );
        System.out.println("");
    }

    public void multipliction() {
        float a, c, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbaer which you want to multipliction");
        a = sc.nextFloat();
        c = sc.nextFloat();
        result = a * c;
        System.out.println("multipliction of " + a + " " + " and " + c + " is " + " " + result);
        System.out.printf("multipliction of %f  " + " and %f  upto two point is " + " " +"%.2f" ,a,c,result );
        System.out.println("");
    }

    public void devition() {
        float a, c, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbaer which you want to divition");
        a = sc.nextFloat();
        c = sc.nextFloat();
        if (c != 0) {
            result = a / c;
            System.out.println("devetion of " + a + " " + " and " + c + " is " + " " + result);
            System.out.printf("devetion of %f  " + " and %f  upto two point is " + " " +"%.2f" ,a,c,result );
            System.out.println("");
        } else {
            System.out.println("Devisor should not zero please enter valid number");
        }
    }
    public void modulo() {
        int a, c, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbaer which you want to modul");
        a = sc.nextInt();
        c = sc.nextInt();
        result = a % c;
        System.out.println("modulo of " + a + " " + " and " + c + " is " + " " + result);
    }
}
