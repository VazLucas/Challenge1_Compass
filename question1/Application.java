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
    }

}


