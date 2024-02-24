//^^Package for calculator folder.
import java.util.*;
/**
 * the program works, but refine it. Fix the UI and make it easier to use
 * make the exit more clear -- Done(Thank you line)
 */

public class CalculatorV1 {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator, ");

        double vals[] = new double[2];
        //array to hold the list of values enterd by user.
        Scanner kb = new Scanner(System.in);
        int choice = 0;
        String exit = "N";
        String useRes = "N";
        double res = 0;

        while(exit != "Y" || choice == 6){
            System.out.println("-----------------------------------------------");
            if(useRes == "Y" || useRes == "y"){
                vals[0] = res;
            } else if(useRes == "N" || useRes == "n") {
                //MAKE VALIDATION CHECK FOR CHARS OR STRINGS AS IMPUT
            System.out.print("Please enter your first number:");
            vals[0] = kb.nextDouble();
            }
            System.out.print("\nPlease enter your second number:");
            vals[1] = kb.nextDouble();
            Menu();
            choice = kb.nextInt();

            //run the choices
            if(choice != 6){
                System.out.println("result: "+calc(choice, vals));
                res = calc(choice, vals);
                //Use the result of the first calculation in the next.
            }
            System.out.println("Would you like to use your result in your next calculation? (Y/N)");

            if(kb.nextLine() == "Y" || kb.nextLine() == "y"){
                useRes = "Y";
            }else {
                System.out.println("Would you like to continue? (Y/N)");
                exit = kb.nextLine();
                if(exit.equals("n")){
                    break;
                }
            }
        }
        System.out.println("Thank you for using the calculator.");
        kb.close();
    }
    //xxxxxxxxxxxxxxxxxxxxx 
    //I want to pass the choice option to the operations class where it will perform the operation, I then want to display the answer, and offer the user
    //**if they would like to keep the answer of the current operation**,(<-- that is what I need to do.)
    // clear for new calculation, or exit.
    //xxxxxxxxxxxxxxxxxxxxx 

    public static String Menu(){
        System.out.println("What would you like to calculate:");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: Modulus");
        System.out.println("6: Exit Calculator");
        return "---------------------------------";
    }
    
    public static double calc(int choice, double[] vals) {
        if(choice == 1){
            return add(vals);        
        } else if (choice == 2){
            return sub(vals);
        }else if (choice == 3){
            return mult(vals);
        }else if (choice == 4){
            return div(vals);
        } else if(choice == 5){
            return mod(vals);
        }
        return -1;
    }

    public static double add(double[] vals){
        return vals[0] + vals [1];
    }
    
    public static double sub(double[] vals){
        return vals[0] - vals [1];
    }

    public static double mult(double[] vals){
        return vals[0] * vals [1];
    }

    public static double div(double[] vals){
        return vals[0] / vals [1];
    }
    
    public static double mod(double[] vals){
        return vals[0] % vals [1];
    }    
}
