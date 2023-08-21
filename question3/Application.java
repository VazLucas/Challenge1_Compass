import java.util.*;

public class Application {

    public static void main(String[] args) {

        Scanner source = new Scanner(System.in);
        int result = 0;
        List<Integer> results = new ArrayList<>();
        int k = 1;

        while (source.hasNext()) {

            int operandsQuantity = source.nextInt();

            if (operandsQuantity < 1 || operandsQuantity > 100) {
                break;
            }
            if (operandsQuantity != 0) {
                String equation = source.next();

                String equationFormatted = equation.replaceAll("[0-9]", "");
                ArrayList equationCounter = new ArrayList<>((List.of(equation.split("[^0-9]"))));
                ArrayList equationOperator = new ArrayList<>();
                equationOperator.add("");
                for (int i = 0; i < equationFormatted.length(); i++) {
                    equationOperator.add(equationFormatted.charAt(i));
                }
    }
}