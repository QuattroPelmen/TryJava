package TryJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Clone the repository, checkout to the branch first-branch and work within it. After the wor is done - just push it. Do not work with master (see readme file)
public class Main {
    public static void main(String[] args) {
        ComplexConditions complexConditions = new ComplexConditions(new int[]{1,2,3,4,5,6,7,8});
        complexConditions.applyComplexConditions();
        complexConditions.printComplexConditions();
    }


}
