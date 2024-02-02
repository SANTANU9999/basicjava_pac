package basicjava_pac;
import java.lang.*;
//import java.util.*;
public class String_mathode {
    public static void main(String[] args) {
       String s="ram"; 
       String m="santanu";
       String n="sram";
       for(int i=0;i<s.length();i++)
       {
       System.out.println(s.charAt(i));
       }
       System.out.println(s.codePointAt(0)); // return the unicode of specific index
       System.out.println(s.codePointBefore(1)); //return the unicode of brfore of the specific index
       System.out.println(s.codePointCount(0, 3));
       System.out.println(s.compareTo("ram")); // chack two string is equal or not if equel then return -1 and not equel then return -1
       System.out.println(s.getBytes());
       System.out.println(s.getClass());
       System.out.println(s.hashCode());
       System.out.println(m.indexOf('a'));
       System.out.println(m.toString());
       System.out.println(Math.divideExact(2,5));
       
    }
}
