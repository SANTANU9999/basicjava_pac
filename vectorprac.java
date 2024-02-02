package basicjava_pac;
import java.util.*;
public class vectorprac {
    public static void main(String[] args) {
        // in java vector is a APIs class whic is  defined in java.util packege.
        // Vector is like a array but hear only store object not store int ,float etc. 
        //in vector class many methodes is pre-define we can easly use by creating vector class object.
        Vector v= new Vector();     //C reating vector Class object
        v.addElement("santanu Samanta"); // pre-defined Methodes in vector class
        v.addElement("Only");
        v.addElement("loves");
        v.addElement("Tushi Kundu");
        v.addElement("in front of God");
        v.insertElementAt("and marry with",3);
        v.insertElementAt("With God Asirbad",0);
        //excapt this in vector have many pre define mathodes.
        System.out.println(v);
    }
}
