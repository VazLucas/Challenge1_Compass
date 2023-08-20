import java.util.*;

public class Application {


    public static void main(String[] args) {

        ArrayList<Integer> problemSolved = new ArrayList<Integer>();
        ArrayList<String> studentsName = new ArrayList<String>();

        Scanner source = new Scanner(System.in);
        int studentsQuantity = source.nextInt();

        for (int i = 0; i < studentsQuantity; i++) {
            studentsName.add(source.next());
            problemSolved.add(source.nextInt());
        }
        for (int j = problemSolved.size()-1, i = 0; j >0;j-- ) {
            if(problemSolved.get(i)>problemSolved.get(j))
            {
                problemSolved.remove(i);
                studentsName.remove(i);
            }
            else if (problemSolved.get(i)<problemSolved.get(j)){
                problemSolved.remove(j);
                studentsName.remove(j);

            }
            else if (Objects.equals(problemSolved.get(i), problemSolved.get(j))){

            }

    }

}


