package TryJava;
public class BubbleSort {
    private int[] inputArray;

    public void printSortedArray() {
        System.out.print("\n" + "Sorted array: ");
        for (int index = 0; index < inputArray.length; index++) {
            System.out.print(inputArray[index] + " ");
        }
    }
    public BubbleSort(int[] inputArray) {
        this.inputArray = inputArray;
    }
    public void applyBubbleSort() {
        boolean isSortingRequired = true;
        int temp;
        while (isSortingRequired){
            isSortingRequired = false;
            for (int index = 0; index < inputArray.length - 1; index++) {
                if (inputArray[index + 1] < inputArray[index]) {
                    temp = inputArray[index + 1];
                    inputArray[index + 1] = inputArray[index];
                    inputArray[index] = temp;
                    isSortingRequired = true;
                }
            }
        }
    }
}