package TryJava;
import java.util.Arrays;
public class ComplexConditions {
    private final int[] inputArray;
    public int[] modifiedArray;
    public ComplexConditions(int[] inputArray){
        this.inputArray = Arrays.copyOf(inputArray,inputArray.length);
        this.modifiedArray = Arrays.copyOf(inputArray, inputArray.length);
    }
    public void printComplexConditions(){
        System.out.println("Initial array" + "\n");
        printArray(inputArray);
        System.out.println("\n" + "Array after complex conditions being applied to it" + "\n");
        printArray(modifiedArray);
    }
    public void applyComplexConditions(){   // +
        applyValueConditions();
        applySortingConditions();
    }
    public void applyAlternateComplexConditions(){
        applyValueConditions();
        applyAlternateComplexConditions();
    }
    public void printArray(int[]input){  // old conventions. (int[] input) - would be better - done
        for (int i = 0; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
    }
    private void applyValueConditions(){  // this is not tested
        for (int index = 0; index < inputArray.length; index++){ // for (int index = 0; ... - done
            if((index + 1) % 3 == 0){
                modifiedArray[index] += 25; // when have you assigned a value to the array's member? - done
            }
            if ((inputArray[index] % 2) == 0 && (inputArray[index] % 8) != 0){
                modifiedArray[index] *= 3;
            }  //else if would be a little bit better, but not significantly - done
            else if ((inputArray[index] % 8) == 0){
                modifiedArray[index] *= 2;
            }
        }
    }
    private int findMinIndex(){
        int minIndex = 0;
        for (int index = 0; index < modifiedArray.length; index++){
            if (modifiedArray[minIndex] >= modifiedArray[index]){
                minIndex = index;
            }
        }
        System.out.println("min: " + minIndex);
        return minIndex;
    }
    private int findMaxIndex(){
        int maxIndex = 0;
        for (int index = 0; index < modifiedArray.length; index++){
            if (modifiedArray[maxIndex] <= modifiedArray[index]){
                maxIndex = index;
            }
        }
        System.out.println("max: " + maxIndex);
        return maxIndex;
    }
    private void swapMinMaxValues(int minIndex, int maxindex){
        int temp;
        if (maxindex != minIndex){
            temp = modifiedArray[minIndex];
            modifiedArray[minIndex] = modifiedArray[maxindex];
            modifiedArray[maxindex] = temp;
        }
    }
    private void applySortingConditions(){
        int minIndex, maxIndex;
        minIndex = findMinIndex();
        maxIndex = findMaxIndex();
        swapMinMaxValues(minIndex,maxIndex);
    }
    private int findLowestMinIndex(){
        int lowestMinIndex = 0;
        for (int index = 0; index < modifiedArray.length; index++){
            if (modifiedArray[lowestMinIndex] > modifiedArray[index]){
                lowestMinIndex = index;
                for (int innerIndex = 1; innerIndex < modifiedArray.length; innerIndex++){
                    if (modifiedArray[lowestMinIndex] == modifiedArray[innerIndex]){
                        break;
                    }
                }
            }
        }
        System.out.println("lowestMin: " + lowestMinIndex);
        return lowestMinIndex;
    }
    private int findLowestMaxIndex(){
        int lowestMaxIndex = 0;
        for (int index = 0; index < modifiedArray.length; index++){
            if (modifiedArray[lowestMaxIndex] < modifiedArray[index]){
                lowestMaxIndex = index;
                for (int innerindex = 1; innerindex < modifiedArray.length; innerindex++){
                    if (modifiedArray[lowestMaxIndex] == modifiedArray[innerindex]){
                        break;
                    }
                }
            }
        }
        System.out.println("Lowest max index: " + lowestMaxIndex);
        return lowestMaxIndex;
    }
    private void applyAlternateSortingConditions(){
    int minIndex, maxIndex;
    minIndex = findLowestMinIndex();
    maxIndex = findLowestMaxIndex();
    swapMinMaxValues(minIndex,maxIndex);
    }
}