package TryJava;

import java.util.Scanner;

public class MathFun {
    public MathFun(){
    }
    public void multiplicationTable(){
        for (int indexRow = 1; indexRow <= 10; indexRow++){
            for (int indexColumn = 1; indexColumn <= 10; indexColumn++){
                System.out.println(indexRow + " * " + indexColumn + " = " + (indexRow * indexColumn));
                System.out.println();
            }
        }
    }
    public int simpleSum(){
        int simpleSum;
        int input = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three digit number");
            input = scanner.nextInt();
            if (input > 999){
                System.out.println("Enter three digit number");
                input = 0;
            }
            else if (input < 999){
                break;
            }
        }
        while (input < 999);
        simpleSum = input / 100 + input % 100 / 10 + input % 10;
        if (simpleSum > 9){
            simpleSum = simpleSum / 10 + simpleSum % 10;
        }
        System.out.println(simpleSum);
        return simpleSum;
    }
    public static void main(String[] args) {
        MathFun mathFun = new MathFun();
//        mathFun.multiplicationTable();
//        mathFun.simpleSum();
        mathFun.primeNumbers();
    }
    public void primeNumbers(){
        System.out.println("List of Prime Numbers");
        for (int index = 2; index <= 100; index++){
            boolean isPrime = true;
            for (int internalIndex = 2; internalIndex <= index-1; internalIndex++){
                if (index % internalIndex == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            System.out.println(index);
        }
    }
}