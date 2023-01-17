public class LogicalOperators {
    public void logicalOperationsAnd(int firstNumber, int secondNumber, int thirdNumber) {

        int a=0;
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("Both the condition are checked"+ a++);
        }
    }

    public void logicalOperationsOr(int firstNumber, int secondNumber, int thirdNumber) {

        if(firstNumber<secondNumber||firstNumber<thirdNumber){
            System.out.println("At least one condition is checked ");
        }
    }

    public void logicalOperationsNot(int firstNumber, int secondNumber, int thirdNumber) {

        if(firstNumber==secondNumber!=firstNumber<thirdNumber){
            System.out.println("condition not equal is checked ");
        }
    }
}







