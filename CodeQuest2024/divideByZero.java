import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int c = 0; c < testCases; c++) {
                           
                double dividend;
                double divisor;
                double answer;

                String[] values = input.nextLine().split(" ");

                if (!values[0].matches("[-+]?[0-9]*\\.?[0-9]+")) {
                    System.out.println("Invalid Dividend");
                    continue;
                }

                dividend = Double.parseDouble(values[0]);

                if (!values[1].matches("[-+]?[0-9]*\\.?[0-9]+")) {
                    System.out.println("Invalid Divisor");
                    continue;
                }

                divisor = Double.parseDouble(values[1]);

                if (divisor == 0) {
                    System.out.println("Divide By Zero");
                    continue;
                }

                answer = dividend / divisor;

                System.out.printf("%.1f%n", answer);
            
            }
        }
    }

}