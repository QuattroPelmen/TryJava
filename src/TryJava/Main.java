package TryJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Clone the repository, checkout to the branch first-branch and work within it. After the wor is done - just push it. Do not work with master (see readme file)
public class Main {
    public static void main(String[] args) {
//        ComplexConditions complexConditions = new ComplexConditions(new int[]{9,9,9,9,1,1,1,1});
//        complexConditions.applyComplexConditions();
//        complexConditions.printComplexConditions();
        BubbleSort bubbleSort = new BubbleSort(new int[]{1,2,3,4,5});
        System.out.println("1,2,3,4,5");
        bubbleSort.applyBubbleSortReverse();
        bubbleSort.printSortedArray();
    }
}


//      Каждый третий элемент inputArray увеличивается на 25 - done
//      Каждый элемент массива, который нацело делится на 2, но не делится на 8, умножается на 3. - done
//      Те элементы, что нацело делятся на 8 должны быть удвоены.

//      Максимальный элемент массива нужно поменять местами с минимальным
//      при этом если один из них повторяется, меняем местами те, которые имеют больший индекс.