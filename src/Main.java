import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Clone the repository, checkout to the branch first-branch and work within it. After the wor is done - just push it. Do not work with master (see readme file)
public class Main {
    public static void main(String[] args) {
        List<String> notSortedList =  new ArrayList<>(Arrays.asList("Please", "sort", "this", "list", "in", "descending", "order")),
        sortedList = null;
        String output = "";
        notSortedList.stream().forEach(s -> System.out.print(s + " "));
        sortedList = notSortedList;
        Collections.reverse(sortedList);
        System.out.println("\n" + "List sorted in descending order");
        StringBuilder stringBuilder = new StringBuilder();
        sortedList.stream().forEach(s -> stringBuilder.append(s).append(" "));
        output = stringBuilder.toString();
        System.out.println(output);
    }
}
