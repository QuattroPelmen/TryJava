package TryJava;

import java.util.Arrays;

public class ComplexConditions {
    private final int[] inputArray;
    public int[] modifiedArray, tempArray;

    public ComplexConditions(int[] inputArray){

        this.inputArray = Arrays.copyOf(inputArray,inputArray.length);
        this.modifiedArray = new int[inputArray.length]; // We can have all actions performed here.
    }
    private void applyValueConditions(){  // this is not tested
        int index;

        for (index = 0; index < inputArray.length; index++){ // for (int index = 0; ...
            if(index % 3 == 0){
                modifiedArray[index] += 25; // when have you assigned a value to the array's member?
            }
            if (inputArray[index] % 2 == 0 && inputArray[index] % 8 > 0){
                modifiedArray[index] *= 3;
            }  //else if would be a little bit better, but not significantly
            if (inputArray[index] % 8 == 0){
                modifiedArray[index] *= 2;
            }

        }
    }
    private void applySortingConditions(){ //this is raw
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
    public void applyComplexConditions(){   // +
        applyValueConditions();
        applySortingConditions();
    }
    private void printArray(int input[]){  // old conventions. (int[] input) - would be better
        for (int i = 0; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
    }
                                            /* empty lines between methods rule is up to project conventions, but we should choose the only way from the below:
                                               1. No empty lines between methods at all.
                                               2. Empty lines between different code regions (fields, constructors, public methods and private methods)
                                               3. Every member of a class should be followed by an empty line, except the last one.
                                             */
    public void printComplexConditions(){  // ++
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