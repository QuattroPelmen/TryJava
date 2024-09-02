package TryJava;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class MathNumberToSum {
    public static int numberToSum (int inputNumber){
        int sum = 0;
        sum += inputNumber % 10;

        do{
            inputNumber = inputNumber / 10;
            sum += inputNumber % 10;
        }
         while (inputNumber >= 10);
         return sum;
    }

    public static int numberToSumAlternate (int inputNumber){
        //this one is more for smiling and remembering autobox / wrapper and so on
        int sum = 0;
        String input = new String(String.valueOf(inputNumber));

        for (int index = 0; index < input.length(); index++){
            sum += Integer.parseInt(String.valueOf((input.charAt(index))));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numberToSumAlternate(234));
        System.out.println(numberToSum(234));
    }
}
