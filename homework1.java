import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        /*
         * Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	        1 : + (Addition) a + b
            2 : - (Subtraction) a - b
            3 : * (Multiplication) a * b
            4 : / (Division) a / b
            5 : % (Modulo or remainder) a % b
            Calculate the result according to the operation given and display it to the 
            user.

            Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

         */

        Scanner op = new Scanner(System.in);

        System.out.print("a = "); int a = op.nextInt();
        System.out.print("b = "); int b = op.nextInt();
        System.out.print("Operation ? "); String operation = op.next();

        switch(operation){
            case "+" : 
                System.out.println("Addition");
                System.out.println(a + " + " + b +  " = " +(a+b));
                break;

            case "-" :
                System.out.println("Substraction");
                System.out.println(a + " - " + b + " = " +(a-b));
                break;
            
            case "*" :
                System.out.println("Multiplication");
                System.out.println(a +" x "+b+" = "+(a*b));
                break;

            case "/" :
                System.out.println("Division");
                System.out.println(a+" / "+b+" = "+(a/b)); 
                break;

            case "%" :
                System.out.println("Modulus");
                System.out.println(a+" % "+b+" = "+(a%b)); 
        }


        System.out.println();
        System.out.println("Month Printer");
        System.out.print("Enter your Number : "); int month = op.nextInt();

        switch (month) {
            case 1 : 
                System.out.println("January");
                break;
            
            case 2 : 
                System.out.println("February");
                break;

            case 3 : 
                System.out.println("March");
                break;

            case 4 : 
                System.out.println("April");
                break;

            case 5 : 
                System.out.println("May");
                break;

            case 6 :
                System.out.println("June");
                break;

            case 7 : 
                System.out.println("July");
                break;

            case 8 : 
                System.out.println("August");
                break;

            case 9 : 
                System.out.println("September");
                break;

            case 10 : 
                System.out.println("October");
                break; 

            case 11 :
                System.out.println("November");
                break; 

            case 12 : 
                System.out.println("December");
                break;
        }


        op.close();
    }
}
