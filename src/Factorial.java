import java.util.Scanner;
public class Factorial {
    static int variableForFactorial;
    static int result = 1;
    public static int calculateFactorial(int variableForFactorial){
        for (int multiplier = 2; multiplier <= variableForFactorial; multiplier++){
            result *= multiplier;
        }
        System.out.println("result is " + result);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for the factorial calculation");
        calculateFactorial(scanner.nextInt());
    }
}

