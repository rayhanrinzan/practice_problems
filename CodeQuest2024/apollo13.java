import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          DecimalFormat df = new DecimalFormat("000.00##");
          double x = input.nextDouble();
          double y = input.nextDouble();
          double z = input.nextDouble();
          if(x > 180.0) System.out.print(df.format(x - 180.0));
          else if(x < 180.0) System.out.print(df.format(x + 180.0));
          else System.out.print("000.00");
          System.out.print(" ");
          if(y > 180.0) System.out.print(df.format(y - 180.0));
          else if(y < 180.0) System.out.print(df.format(y + 180.0));
          else System.out.print("000.00");
          System.out.print(" ");
          if(z > 180.0) System.out.print(df.format(z - 180.0));
          else if(z < 180.0) System.out.print(df.format(z + 180.0));
          else System.out.print("000.00");
          System.out.println();
      }
      }
    }
}