import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //vvv---Var initializaion.
        Scanner kb = new Scanner(System.in);
        Calculator c = new Calculator(); 
        int input = 0;
        boolean exit = false;
        Boolean useLast = false;
        double x = 0;
        double y = 0;

        //Loop to run the program until the user is done.
        while(exit == false){

            if(useLast == false){
                System.out.print("Please enter your first number: ");
                x = kb.nextDouble();
                System.out.print("\nPlease enter your second number: ");
                y = kb.nextDouble();
            }

            if(useLast == true){
                System.out.print("Please enter your first number: ");
                x = kb.nextDouble();
            }

            boolean check = false;

            while(check != true){
                c.Menu();
                input = kb.nextInt();
                check = c.inputCheck(input);
                if(check == false){
                    System.out.println("!!!!!!!!!!!Please choose a valid option!!!!!!!!!!!");
                }
            }

            if(input == 6){
                exit = true;
                break;
            }
            
            ChoseOperator co = new ChoseOperator(input);
            Operator o = co.selectedOperator();
            
            System.out.println("Answer: " + c.solve(x,y,o, useLast));

            useLast = usePrev();
        }

        System.out.println("Exiting...");
        kb.close();
        System.out.println("Exited. Thank you.");
    }

    public static boolean usePrev(){
        Scanner kbs = new Scanner(System.in);

        System.out.println("Would you like to use that answer in your next calculation (Yes/No): ");
        String in = kbs.nextLine();

        if(in.equalsIgnoreCase("yes")){
            System.out.println("--Using Answer from previous answer--");
            kbs.close();
            return true;
        }else if( in.equalsIgnoreCase("y")){
            System.out.println("--Using Answer from previous answer--");
            kbs.close();
            return true;
        }

        kbs.close();
        return false;
    }
}