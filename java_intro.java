// Importing the util package for user input
import java.util.*;

public class java_intro {
    public static void main (String args[]){
        // Outputs in Java 
        System.out.print("Hello World"); // NOTE : System is a class, println is a function of that class 
        System.out.println("Hello World again");
        System.out.print("This should be on the next line \n");

        /* Variables in Java 
            ---------------
            > They are names given to the memory blocks where the value is stored  
            > For arrays, they can the name of the first memory block
         */

         /* 
            Data Types in Java
            ----------------
            > Java is a typed language. Before making a variable, you have to declare it's type 
            > There are 2 types of Data types : 
                1. Primitive (byte, short, char,  boolean, int , long , float, double)
                2. Non-Primitive (String, array, class, object, interface)
            > byte = 1 byte | char = 2 bytes | boolean = 1 byte | int = 4 bytes | long = 8 bytes | float = 4 bytes | double = 8 bytes
         */

        
        // taking input in Java 
        Scanner op = new Scanner(System.in) ;
        String name = op.nextLine(); //NOTE .next() will only take one token, will not take anything after a space
        System.out.println("Hello "+name);
        op.close() ;

        /*
        Similarly we have
        > for strings : .next() .nextLine()
        > for int : .nextInt()
        > for Float : .nextFloat()
        > for Double : .nextDouble()
         */

        /* 
         * Conditional Statements
         * --------------------
         * 
        */
    }
}