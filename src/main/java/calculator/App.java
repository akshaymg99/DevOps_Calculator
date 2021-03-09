package calculator;
import java.util.*;
public class App
{
    public static void main(String args[])
    {
        int choice, flag=0;
        double num1,num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator");
        do {
            System.out.println("1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            if (choice > 4 || choice <1) {
                flag = 1;
                System.out.println("Invalid choice, exiting\n");
            }
            else if (flag != 1){
            	 System.out.println("Enter two numbers");
                 System.out.print("Enter number 1: ");
                 num1 = scan.nextDouble();
                 System.out.print("Enter number 2: ");
                 num2 = scan.nextDouble();
                 
                 switch(choice) {
                 case 1: System.out.println(num1+" + "+num2+" = "+Add(num1, num2));
                 		break;
                 case 2: System.out.println(num1+" - "+num2+" = "+Subtract(num1, num2));
                 		break;
                 case 3: System.out.println(num1+" * "+num2+" = "+Multiply(num1, num2));
                 		break;
                 case 4: System.out.println(num1+" / "+num2+" = "+Divide(num1, num2));
                		break;
                default: System.out.println("Exiting, Bye");
                flag=1;
                }
            }
            System.out.println("\n");
            }while(flag==0);
    }
    
    static double Add(double a, double b) {
    	return a + b;
    }
    static double Subtract(double a, double b) {
    	return a - b;
    }
    static double Multiply(double a, double b) {
    	return a * b;
    }
    static double Divide(double a, double b) {
    	if (b == 0) {
    		throw new IllegalArgumentException("Divisor cannot be zero, Exiting");
    	}
    	else return a / b;
    }
}