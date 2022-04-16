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
        logger.info("[Operation] => Square Root :: " + num + "\n");
        double result = Math.sqrt(num);
        logger.info("[Result] => Square root is : " + result + "\n");
        if(num<0) logger.info("[Info] => Invailid input => Negative number\n");
        logger.info("\n");
        return result;
    }

    public double factorial(double num){
        logger.info("[Operation] => Factorial :: " + num + "\n");
        if(num < 0){
            logger.info("[Info] => Invailid input => Negative number\n\n");
            return Double.NaN;
        }
        else{
            double fact = 1;
            for(int i = 1; i <= num; i++){
                fact *= i;
            }
            logger.info("[Result] => Factorial is : " + fact + "\n\n");
            return fact;
        }
    }

    public double logarithm(double num){
        logger.info("[Operation] => Natural Logarithm :: " + num + "\n");
        double result = Math.log(num);
        logger.info("[Result] => Natural Logarithm is : " + result + "\n");
        if(num<0) logger.info("[Info] => Invailid input => Negative number\n");
        logger.info("\n");
        return result;
    }

    public double power(double num1, double num2){
        logger.info("[Operation] => Power :: " + num1 + "^" + num2 + "/n");
        double result = Math.pow(num1,num2);
        logger.info("[Result] => Power is : " + result + "\n\n");
        return result;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---*** !! Calculator Operations !! ***---");
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
                    System.out.println("[[Square Root]]");
                    System.out.print("Enter a number: ");
                    x = scanner.nextDouble();
                    System.out.println("Square Root of " + x + " : " + calc.squareRoot(x));
                    System.out.println("[[Done]]");
                    break;

                case 2: // For Factorial
                    System.out.println("[[Factorial]]");
                    System.out.print("Enter a number: ");
                    x = scanner.nextDouble();
                    System.out.println("Factorial of " + x + " : " + calc.factorial(x));
                    System.out.println("[[Done]]");
                    break;

                case 3:  // For Natural Logarithm
                    System.out.println("[[Natural Logarithm]]");
                    System.out.print("Enter a number: ");
                    x = scanner.nextDouble();
                    System.out.println("Natural Logarithm of " + x + " : " + calc.logarithm(x));
                    System.out.println("[[Done]]");
                    break;

                case 4:  // For Power Function
                    System.out.println("[[Power]]");
                    System.out.print("Enter the first number: ");
                    x = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    y = scanner.nextDouble();
                    System.out.println("Power of :" + x + "^" + y + " : " + calc.power(x,y));
                    System.out.println("[[Done]]");
                    break;

                case 5:
                    System.out.println("---*** !! Exit !! ***---");
                    exit(0);

                default:
                    System.out.println("Invalid choice entered!");

            }
            System.out.println("\n");
        }
    }
}