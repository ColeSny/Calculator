public class ChoseOperator {
    private int input;
    public ChoseOperator(int input){
        this.input = input;
    }

    public Operator selectedOperator(){
        if(input == 1){
            return new Addition();
        } else if(input == 2){
            return new Subtraction();
        } else if(input == 3){
            return new Multiplication();
        }else if(input == 4){
            return new Division();
        }

        return new Modulus();
        
    }
}
