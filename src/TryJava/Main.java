package TryJava;

public class Main {
    public static void main(String[] args) {
        ComplexConditions complexConditions = new ComplexConditions(new int[]{9,9,9,9,1,1,1,1}, true);
        ComplexConditions complexConditions2 = new ComplexConditions(new int[]{9,9,9,9,1,1,1,1}, false);
        complexConditions.printBothArrays();
        complexConditions2.printBothArrays();
    }
}