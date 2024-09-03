//Clone the repository, checkout to the branch first-branch and work within it. After the wor is done - just push it. Do not work with master (see readme file)
public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String columnSpaceBig = "        ";
        String columnSpaceSmall = "     ";
        String rowSpace = "\n";

        stringBuilder.append(columnSpaceBig).append(columnSpaceBig).append("Таблица умножения").append(rowSpace);
        int count = 0;
        for (int first = 2; first <= 9; first++){
            for (int second = 2; second <= 10; second++){
                if (count >= 4){
                    count = 0;
                    stringBuilder.append(rowSpace);
                }
                int multiply = first * second;
                stringBuilder.append(first).append(" X ").append(second).append(" = ").append(multiply);

                //line skip part
                if(first == 5 & second == 10)
                    stringBuilder.append(rowSpace);

                //formatting part
                if (multiply >=10 & second == 10)
                    stringBuilder.append(columnSpaceSmall);
                else if (multiply >= 10 & second <= 9)
                    stringBuilder.append(columnSpaceSmall).append(" ");
                else stringBuilder.append(columnSpaceBig);
                ++count;
                }
            }
        System.out.println(stringBuilder);
        }
    }