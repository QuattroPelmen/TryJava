package TryJava;

import java.util.Arrays;

public class ComplexConditions {
    private final int[] inputArray;
    public int[] modifiedArray, tempArray;

    public ComplexConditions(int[] inputArray){

        this.inputArray = Arrays.copyOf(inputArray,inputArray.length);
        this.modifiedArray = new int[inputArray.length];
    }
    private void applyValueConditions(){
        int index;

        for (index = 0; index < inputArray.length; index++){
            if(index % 3 == 0){
                modifiedArray[index] += 25;
            }
            if (inputArray[index] % 2 == 0 && inputArray[index] % 8 > 0){
                modifiedArray[index] *= 3;
            }
            if (inputArray[index] % 8 == 0){
                modifiedArray[index] *= 2;
            }

        }
    }
    private void applySortingConditions(){
        int index;
        int temp;
        for (index = 0; index < modifiedArray.length; index++){
            //ascending sort
            if (modifiedArray[index] < modifiedArray[index +1]){
                temp = modifiedArray[index + 1];
                modifiedArray[index + 1] = modifiedArray[index];
                modifiedArray[index] = temp;
            }
            //advanced sort


        }


    }
    public void applyComplexConditions(){
        applyValueConditions();
        applySortingConditions();
    }
    private void printArray(int input[]){
        for (int i = 0; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
    }

    public void printComplexConditions(){
        System.out.println("Initial array" + "\n");
        printArray(inputArray);
        System.out.println("\n" + "Array after complex conditions being applied to it" + "\n");
        printArray(modifiedArray);
    }
}


//      private final int[] inputArray; // Задается один раз в конструкторе - done
//      public int[] modifiedArray; // Получается из inputArray следующим образом: - done
//      Каждый третий элемент inputArray увеличивается на 25 - done
//      Каждый элемент массива, который нацело делится на 2, но не делится на 8, умножается на 3. - done
//      Те элементы, что нацело делятся на 8 должны быть удвоены. - done
//      Максимальный элемент массива нужно поменять местами с минимальным - done
// при этом если один из них повторяется, меняем местами те, которые имеют больший индекс.
//      Создай объект этого класса в Main и выведи оба массива один под другим. done
//      ветку в гите назови complex-conditions - done
//      после пуша создай pull request - done