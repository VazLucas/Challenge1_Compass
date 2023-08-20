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
        for (int j = problemSolved.size() - 1, i = 0; j > 0; j--) {
            if (problemSolved.get(i) > problemSolved.get(j)) {
                problemSolved.remove(i);
                studentsName.remove(i);
            } else if (problemSolved.get(i) < problemSolved.get(j)) {
                problemSolved.remove(j);
                studentsName.remove(j);

            } else if (Objects.equals(problemSolved.get(i), problemSolved.get(j))) {
                if (studentsName.get(i).compareTo(studentsName.get(j)) > 0) {
                    studentsName.remove(j);
                    problemSolved.remove(j);
                } else if (studentsName.get(i).compareTo(studentsName.get(j)) < 0) {
                    studentsName.remove(i);
                    problemSolved.remove(i);
                } else {
                    System.out.println("Both students have the same name");
                    break;
                }

            } else {
                break;
            }

        }
        System.out.println("Instance:" + k);
        System.out.println(studentsName.get(0));

    }
}


