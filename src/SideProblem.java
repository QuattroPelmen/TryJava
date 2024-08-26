public class SideProblem {

    public static int[] modifyArray(int startIndex, int endIndex, int[] inputArray){
        int outputArrayLength = 0;
        int outputArrayIndex = 0;
        if(endIndex <= startIndex){
            System.out.println("Enter endIndex greater than startIndex");
            System.exit(0);
        }
        for(int index = startIndex; index <= endIndex; index++){
            if (inputArray[index] % 3 == 0 || inputArray[index] % 4 == 0){
                outputArrayLength++;
            }
        }
        int[] outputArray = new int[outputArrayLength];
        for(int index = startIndex; index <= endIndex; index++){
            if (inputArray[index] % 3 == 0 || inputArray[index] % 4 == 0){
                outputArray[outputArrayIndex] = inputArray[index];
                outputArrayIndex++;
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
}

//    нужен метод, который принимает на вход 2 числа - границы диапазона и массив целых чисел. done
//    А на выходе массив из чисел, найденных во входном массиве,
//    значения которых находятся между введенными границами И
//    делятся нацело на 3 и на 4.