import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int n = input.nextInt();
          double nd = n;
          DecimalFormat df = new DecimalFormat(".#");
          System.out.println(df.format(40075.0 + 2.0*Math.PI*nd));
      }
      }
    }
}