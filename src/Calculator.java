public class Calculator {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber(){
        return firstNumber;
    }

    public int getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(int firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber){
        this.secondNumber = secondNumber;
    }
    public int addOperation(){
        int result = this.firstNumber + this.secondNumber;
        return result;
    }
    public int multiplicationOperation(){
        int result = this.firstNumber * this.secondNumber;
        return result;
    }
    public int dividOperation(){
        int result = this.firstNumber/this.secondNumber;
        return result;
    }
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        //set first and second number
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(20);

        //addition operation
        int addAnswer = calculator.addOperation();
        int multAnswer = calculator.multiplicationOperation();
        int f1st = calculator.getFirstNumber();
        int scd = calculator.getSecondNumber();

        System.out.println(f1st + " x " + scd + " is: " + multAnswer + " However " + f1st + " + " + scd + " is " + addAnswer);


    }
}
