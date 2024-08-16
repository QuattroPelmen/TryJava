package TryJava;

public class TwoDimensionalArrayModificator {
    public TwoDimensionalArrayModificator(int[][] inputArray){
        this.inputArray = inputArray;
    };
    private int[][] inputArray;
    public int[][] arraySort(){
        int[][] outputArray = new int[inputArray.length][inputArray[0].length];
        for(int index = 0; index <= inputArray[0].length; index++){
            if (inputArray[index][0] % 2 == 0){
                BubbleSort bubbleSort = new BubbleSort(inputArray[index]);
                bubbleSort.applyBubbleSort();
                inputArray[index] = bubbleSort.getSortedArray();
            } else {
                BubbleSort bubbleSort = new BubbleSort(inputArray[index]);
                bubbleSort.applyBubbleSortReverse();
                inputArray[index] = bubbleSort.getSortedArray();
            }
        }
        return outputArray;
    }
    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 } };
        TwoDimensionalArrayModificator twoDimensionalArrayModificator = new TwoDimensionalArrayModificator(array);
        twoDimensionalArrayModificator.arraySort();
    }
}