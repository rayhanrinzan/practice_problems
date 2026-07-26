import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        String line = input.nextLine();
        System.out.println("Total of the bill: " + line);
        double money = Double.valueOf(line.substring(1));
        double fifteen = .15*money;
        double eighteen = .18*money;
        double twenty = .2*money;
        System.out.print("15% = $");
        System.out.printf("%.2f", fifteen);
        System.out.println();
        System.out.print("18% = $");
        System.out.printf("%.2f", eighteen);
        System.out.println();
        System.out.print("20% = $");
        System.out.printf("%.2f", twenty);
        System.out.println();
          
      }
      }
    }
}