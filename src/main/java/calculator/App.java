package calculator;
import java.util.*;
public class App
{
    public static void main(String args[])
    {
        int choice, flag=0;
        double x=1, b=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Scientific Calculator");
        do {
            System.out.println("1 Square root\n2 Factorial\n3 Natural Log\n4 Power function\n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            if (choice > 4 || choice <1) {
                flag = 1;
                System.out.println("Invalid choice, exiting\n");
            }
            else if (flag != 1){
                if(choice != 4) {
                    System.out.println("Enter input no x");
                    x = scan.nextDouble();
                }
                else if(choice == 4) {
                    System.out.println("Enter x (base no)");
                    x = scan.nextDouble();
                    System.out.println("Enter b (power no)");
                    b = scan.nextDouble();
                }

                 switch(choice) {
                 case 1: System.out.println( "Sqrt of "+x+" = "+Sqrt_fun(x));
                 		break;
                 case 2: System.out.println("Factorial of "+x+" = "+Factorial(x));
                 		break;
                 case 3: System.out.println("Natural log of"+x+" = "+Nat_log(x));
                 		break;
                 case 4: System.out.println("Power of"+x+"^"+b+" = "+power_xb(x, b));
                		break;
                default: System.out.println("Exiting, Bye");
                flag=1;
                }
            }
            System.out.println("\n");
            }while(flag==0);
    }
    
    static double Sqrt_fun(double x) {
    	if (x <= 0) {
    	    throw new IllegalArgumentException("Square root of zero and negative doesn't exits in Real number space");
        }
    	else
    	    return Math.sqrt(x);
    }
    static double Factorial(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial doesn't exist for negative numbers");
        }
        else {
            double fact = 1;
            for(int i=2; i<=x; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }
    static double Nat_log(double x) {
        if(x <= 0) {
            throw new IllegalArgumentException("Number cannot be zero or negative");
        }
        else
            return Math.log(x);
    }
    static double power_xb(double x, double b) {
    	if (x == 0) {
    		throw new IllegalArgumentException("Base cannot be zero");
    	}
    	else
    	    return Math.pow(x, b);
    }
}