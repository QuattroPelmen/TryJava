import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Clone the repository, checkout to the branch first-branch and work within it. After the wor is done - just push it. Do not work with master (see readme file)
public class Main {
    public static void main(String[] args) {
        List<String> notSortedList =  new ArrayList<>(Arrays.asList("Please", "sort", "this", "list", "in", "descending", "order")),
                sortedList = null;
        String output = "";
        notSortedList.stream().forEach(s -> System.out.print(s + " "));
        
        //put your code here, commit and push it to the origin first-branch (not to master)

    }
}
