import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int c = 0; c < testCases; c++) {
                int n = input.nextInt();
                int cMax = input.nextInt();
                int nMax = input.nextInt();
                int depth = 0;
                int comp = 0;

                input.nextLine();

                for (int i = 0; i < n; i++) {
                    String line = input.nextLine();

                    if (line.length() > 0 && line.charAt(0) == '{') {
                        depth++;
                    } else if (line.length() > 0 && line.charAt(0) == '}') {
                        depth--;
                    } else if (line.length() > 2 && line.substring(0, 2).equals("If")) {
                        comp++;
                    }
                }

                if (comp <= cMax && depth <= nMax) {
                    System.out.println(comp + " " + depth +" PASS");
                } else {
                    System.out.println(comp + " " + depth + " FAIL");
                }
            }
        }
    }
}