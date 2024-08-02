import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> notSortedList =  new ArrayList<>(Arrays.asList("Please", "sort", "this", "list", "in", "descending", "order")),
                sortedList = null;
        String output = "";
        notSortedList.stream().forEach(s -> System.out.print(s + " "));

        //check the first-branch branch and you will see the first task here 
    }
}
