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
        System.out.print("Enter your Name");
        Scanner op = new Scanner(System.in) ;
        String name = op.nextLine(); //NOTE .next() will only take one token, will not take anything after a space
        System.out.println("Hello "+name);
        

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
         * 1. If else 
         * 2. else if
         * 3. switch
         * 4. break
        */
        System.out.print("Enter your Age : ");
        int age = op.nextInt();
        if (age>=18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You a kid");
        }

        // Q) checking if numbers are equal if not then which greater?
        System.out.println("Enter your Numbers :");
        System.out.print("a = "); int a = op.nextInt(); 
        System.out.print("b = "); int b = op.nextInt(); 

        if (a==b)
            System.out.println("a = b !");
        else if (a > b)
            System.out.println("a > b");
        else
            System.out.println("a < b");


        //  Q) Print 3 different greetings from 3 numbers input
        System.out.print("Enter your choice of language : ");
        int button = op.nextInt(); 

        if (button == 1)
            System.out.println("Hello");
        else if (button==2)
            System.out.println("Namaste");
        else if (button==3)
            System.out.println("Bonjoure");
        else 
            System.out.println("Invalid Button pressed");


        // Doing the above same question using Switch 
        System.out.println("Enter your choice of language : ");
        button = op.nextInt(); 

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjoure");
                break;

            default:
                System.out.println("Invalid button pressed");
                break;
        }

        op.close() ;
    }
}