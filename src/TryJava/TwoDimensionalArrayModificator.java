package TryJava;

import java.util.Arrays;

public class TwoDimensionalArrayModificator {
    private int[][] inputArray;
    private int[][] outputArray;
    public TwoDimensionalArrayModificator(int[][] inputArray){
        this.inputArray = inputArray;
        this.outputArray = Arrays.copyOf(inputArray, inputArray.length);
    }
    public void arraySort(){
        for(int index = 0; index < inputArray.length; index++){
            System.out.println("input array value " + inputArray[index][0]);
            if (inputArray[index][0] % 2 == 0){
                BubbleSort bubbleSort = new BubbleSort(inputArray[index]);
                bubbleSort.applyBubbleSort();
                outputArray[index] = bubbleSort.getSortedArray();
            } else {
                System.out.println("enter else");
                BubbleSort bubbleSort = new BubbleSort(inputArray[index]);
                bubbleSort.applyBubbleSortReverse();
                outputArray[index] = bubbleSort.getSortedArray();
            }
        }
    }
    public void printInputArray(){
        for(int index = 0; index < inputArray.length; index++){
            for(int internalIndex = 0; internalIndex < inputArray[index].length; internalIndex++){
                System.out.print(inputArray[index][internalIndex] + " ");
            }
        }
    }
    public void printOutputArray(){
        for(int index = 0; index < outputArray.length; index++){
            System.out.println("\n" + "Line number: " + index);
            for(int internalIndex = 0; internalIndex < outputArray[index].length; internalIndex++){
                System.out.print(outputArray[index][internalIndex] + " ");
            }
        }
    }
    public static void main(String[] args) {
        TwoDimensionalArrayModificator twoDimensionalArrayModificator =
        new TwoDimensionalArrayModificator(new int[][]{{1, 1, 3, 4}, {2, 3, 4, 5, 6, 8}, {4,2,1}});
        twoDimensionalArrayModificator.printInputArray();
        twoDimensionalArrayModificator.arraySort();
        twoDimensionalArrayModificator.printOutputArray();
    }
}