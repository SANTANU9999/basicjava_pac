package basicjava_pac;
import java.util.Scanner;

public class upperlower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        char m;
       // boolean z;
        s=sc.nextLine();
        //String o,p;
        char []arr=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {  
           // o=s;
            m=s.charAt(i);
           // z=Character.isUpperCase(m);
            //p= " "+ z;
           if(Character.isUpperCase(m)==true){
            m= Character.toLowerCase(m);
            arr[i]=m;
           }
           else{
            m=Character.toUpperCase(m);
             arr[i]=m;
           }
            
        }
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
       
        
    }
    
}
