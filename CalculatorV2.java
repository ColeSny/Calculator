//This version will use inheritance & Polymorphism
import java.util.Scanner;

public class CalculatorV2{
    public static double prev = 0.0; //store the last answer.
    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
        int input = 0;
        boolean usePrev = false;
        System.out.println("Welcome to the calculator, ");
        Operator o = new Addition();
        double one = 0.0;
        double two = 0.0;
        //loop to continue calculating.
        while(input != 6){
            if(usePrev == false){
                System.out.print("Please enter your first number: ");
                one = kb.nextDouble();
                System.out.print("Please enter your second number: ");
                two = kb.nextDouble();
            } else {
                System.out.print("Please enter the number youd like to calculate" + prev +" with: ");
                one = kb.nextDouble();
                //at this point prev will always be the second number in the calculation.
            }
    
            System.out.println("Please choose a function: ");
            Menu();
            input = kb.nextInt();
    
            if(input == 1){
                o = new Addition();
            } else if(input == 2){
                o = new Subtraction();
            } else if(input == 3){
                o = new Multiplication();
            }else if(input == 4){
                o = new Division();
            }else if(input == 5){
                o = new Modulus();
            }
            if(usePrev == false){
                System.out.println(solve(one,two,o));
            }else{
                System.out.println(solve(one,prev,o));
            }
            
        }
        System.out.println("Exiting...");
        kb.close();
        System.out.println("Exited");
    }

    public static double solve(double x, double y, Operator o){
        double ret = o.calculate(x,y);
        prev = ret;
        return ret;
    }

    public static String Menu(){
        System.out.println("What would you like to calculate:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Modulus");
        System.out.println("6: Exit Calculator");
        return "---------------------------------";
    }
}

interface Operator {
    public double calculate(double x, double y);
}
  class Addition implements Operator{
    public double calculate(double x, double y){
    return (x + y);
    }
 }
  class Subtraction implements Operator{
    public double calculate(double x, double y){
        return (x - y);
    }
 }
  class Multiplication implements Operator{
    public double calculate(double x, double y){
        return (x * y);
    }
 }
  class Division implements Operator{
    public double calculate(double x, double y){
        return (x / y);
    }
 }
  class Modulus implements Operator{
    public double calculate(double x, double y){
        return (x % y);
    }
 }

