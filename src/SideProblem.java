import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SideProblem {

    public static int[] modifyArray(int minValue, int maxValue, int[] inputArray){
        int outputArrayLength = 0;
        int outputArrayIndex = 0;
        if(maxValue <= minValue){
            System.out.println("Enter correct min and max values");
            System.exit(0);
        }
        for(int index = 0; index < inputArray.length; index++){
            if (inputArray[index] > minValue & inputArray[index] < maxValue){
                if (inputArray[index] % 3 == 0 || inputArray[index] % 4 == 0){
                    outputArrayLength++;
                }
            }

        }
        int[] outputArray = new int[outputArrayLength];
        System.out.println(outputArray.length);
        for(int index = 0; index < inputArray.length; index++){
            if (inputArray[index] > minValue & inputArray[index] < maxValue){
                if (inputArray[index] % 3 == 0 || inputArray[index] % 4 == 0){
                    outputArray[outputArrayIndex] = inputArray[index];
                    outputArrayIndex++;
                }
            }
        }
        printArray(outputArray);
        return outputArray;
    }
    private static void printArray(int[] array){
        for (int index = 0; index < array.length; index++){
            System.out.print(" " + array[index] + " ");
        }
    }
    public static int[] modifyArrayAdvanced(int minValue, int maxValue, int[] inputArray){
        int[] modifiedArray;
        List<Integer> modifiedArrayList = new ArrayList<>();
        List<Integer> inputArrayList = new ArrayList<>();

        for(int i : inputArray){
            inputArrayList.add(i);
        }

        inputArrayList.stream().filter(x -> x > minValue)
                        .filter(x -> x < maxValue & x > minValue)
                        .filter(x -> x % 4 == 0 | x % 3 == 0)
                        .forEach(x -> modifiedArrayList.add(x));

        modifiedArray = new int[modifiedArrayList.size()];
        for (int index = 0; index < modifiedArrayList.size(); index++){
            modifiedArray[index] = modifiedArrayList.get(index).intValue();
        }
        printArray(modifiedArray);
        return modifiedArray;
    }
}