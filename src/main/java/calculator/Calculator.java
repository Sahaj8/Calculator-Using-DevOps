package calculator;

import java.util.Scanner;
import java.util.InputMismatchException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static java.lang.System.exit;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator(){

    }

    public double squareRoot(double num){
        double result = Math.sqrt(num);
        logger.info("Calculating Square Root of : " + num + "\nResult of Square root is : " + result);
        return result;
    }
    public double factorial(double num){
        logger.info("Calculating Square Root of : " + num + "\n");
        if(num < 0){
            logger.info("Factorial of negative number is not possible!");
            return Double.NaN;
        }
        else{
            double fact = 1;
            for(int i = 1; i <= num; i++){
                fact *= i;
            }
            logger.info("Result of factorial is : " + fact);
            return fact;
        }
    }

    public double logarithm(double num){
        logger.info("Calculating Natural Logarithm of : " + num + "\n");
        if(num < 0){
            logger.info("Log of negative number is not possible!");
            return Double.NaN;
        }
        else{
            double result = Math.log(num);
            logger.info("Result of power is : " + result);
            return result;
        }
    }

    public double power(double num1, double num2){
        double result = Math.pow(num1,num2);
        logger.info("Calculating : " + num1 + "^" + num2 + "/n Result of power is : " + result);
        return result;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- !! calculator.Calculator Operations !! ----------");
        while(true){
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice : ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (choice){
                case 1:  // For Square Root
                    System.out.println("Square Root Operation:");
                    System.out.print("Enter a number: ");
                    x = scanner.nextDouble();
                    System.out.println("Square Root of " + x + " : " + cal.squareRoot(x));
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;

                case 2: // For Factorial
                    System.out.println("Factorial Operation:");
                    System.out.print("Enter a number: ");
                    x = scanner.nextDouble();
                    System.out.println("Factorial of " + x + " : " + cal.factorial(x));
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;
                case 3:  // For Natural Logarithm
                    System.out.println("Natural Logarithm Operation:");
                    System.out.print("Enter a number: ");
                    x = scanner.nextDouble();
                    System.out.println("Natural Logarithm of " + x + " : " + cal.logarithm(x));
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;
                case 4:  // For Power Function
                    System.out.println("Exponential Function:");
                    System.out.println("Enter the first number: ");
                    x = scanner.nextDouble();
                    System.out.println("Enter the second number : ");
                    y = scanner.nextDouble();
                    System.out.println("Power :" + x + "^" + y + " : " + cal.power(x,y));
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;

                case 5:
                    System.out.println("---------- !! Exit !! ----------");
                    exit(0);
                default:
                    System.out.println("Invalid choice entered!");

            }
            System.out.println("\n");
        }
    }
}