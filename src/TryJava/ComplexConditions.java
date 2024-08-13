package TryJava;
import java.util.Arrays;
public class ComplexConditions {
    private final int[] inputArray;
    //Attention to the keyword "final" !
    private final int[] modifiedArray;

    public ComplexConditions(int[] inputArray, boolean minIndexConsidered){
        this.inputArray = Arrays.copyOf(inputArray,inputArray.length);
        modifiedArray = Arrays.copyOf(inputArray, inputArray.length);

        applyComplexConditions(minIndexConsidered);
    }

    public void printBothArrays(){
        System.out.println("\n" + "Initial array:");
        printArray(inputArray);
        System.out.println("\n" + "Array after complex conditions being applied to it:");
        printArray(modifiedArray);
    }
    public void applyComplexConditions(boolean minIndexConsidered){
        applyValueConditions();

        if (minIndexConsidered)
            applySortingConditions();
        else
            applyAlternateSortingConditions();
    }

    private void printArray(int[] input){
        for (int j : input) {
            System.out.print(j + " ");
        }
    }
    private void applyValueConditions(){
        for (int index = 0; index < inputArray.length; index++){
            /* Apply the first condition */
            if((index + 1) % 3 == 0){
                modifiedArray[index] += 25;
            }

            /* Apply the 2nd and the 3rd conditions */
            if ((inputArray[index] % 2) == 0 && (inputArray[index] % 8) != 0){
                modifiedArray[index] *= 3;
            }
            else if ((inputArray[index] % 8) == 0){
                modifiedArray[index] *= 2;
            }
        }
    }
    private void applySortingConditions(){
        swapElements(findLastMinElementIndex(), findLastMaxElementIndex());
    }
    private void applyAlternateSortingConditions(){
        swapElements(findFirstMinElementIndex(),findFirstMaxElementIndex());
    }
    /* The next two methods are implemented in another way. */
    private int findLastMinElementIndex(){
        int lastIndex = modifiedArray.length -1,
            lastMinElementIndex = 0;
        for (int index = lastIndex; index >= 0; index--){
            if (modifiedArray[lastMinElementIndex] > modifiedArray[index]){
                lastMinElementIndex = index;
            }
        }
        System.out.println("LastMinElementIndex: " + lastMinElementIndex);
        return lastMinElementIndex;
    }
    private int findLastMaxElementIndex(){
        int lastIndex = modifiedArray.length -1,
            lastMaxElementIndex = lastIndex;
        for (int index = lastIndex; index >= 0; index--){
            if (modifiedArray[lastMaxElementIndex] < modifiedArray[index]){
                lastMaxElementIndex = index;
            }
        }
        System.out.println("LastMaxElementIndex: " + lastMaxElementIndex);
        return lastMaxElementIndex;
    }
    private void swapElements(int index1, int index2){
        if (index2 != index1){
            int temp;
            temp = modifiedArray[index1];
            modifiedArray[index1] = modifiedArray[index2];
            modifiedArray[index2] = temp;
        }
    }
    private int findFirstMinElementIndex(){
        int firstMinElementIndex = 0;
        for (int index = 0; index < modifiedArray.length; index++){
            if (modifiedArray[firstMinElementIndex] > modifiedArray[index]){
                firstMinElementIndex = index;
            }
        }
        System.out.println("FirstMinElementIndex: " + firstMinElementIndex);
        return firstMinElementIndex;
    }
    private int findFirstMaxElementIndex(){
        int firstMaxElementIndex = 0;
        for (int index = 0; index < modifiedArray.length; index++){
            if (modifiedArray[firstMaxElementIndex] < modifiedArray[index]){
                firstMaxElementIndex = index;
            }
        }
        System.out.println("FirstMaxElementIndex: " + firstMaxElementIndex);
        return firstMaxElementIndex;
    }
}