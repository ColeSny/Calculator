public class Calculator {
    double prev;
    
    public double solve(double x, double y, Operator o, Boolean usePrev){
        prev = o.calculate(x, y);
        if(usePrev == true){
            return o.calculate(prev, y);
        }

        return o.calculate(x, y);
    }

    public void Menu(){
        System.out.println("Select what would you like to do with these numbers:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Modulus");
        System.out.println("6: Exit Calculator");
        System.out.println("---------------------------------");
    }

    public Boolean inputCheck(int input){
        if(input >6 || input < 0){
            return false;
        }
        return true;
    }
}
