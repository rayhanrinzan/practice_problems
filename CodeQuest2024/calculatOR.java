import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          double x = input.nextDouble();
          String sign = input.next();
          double y = input.nextDouble();
          String a = "";
          String b;
          if(sign.equals("+")){
              a = String.format("%.1f", (x + y));
              System.out.println(a + " " + a);
          }
          else if(sign.equals("-")){
              a = String.format("%.1f", (x - y));
              b = String.format("%.1f", (y - x));
              System.out.println(a + " " + b);
          }
          else if(sign.equals("*")){
              a = String.format("%.1f", (x*y));
              System.out.println(a + " " + a);
          }
          else{
              b = String.format("%.1f", (y/x));
              System.out.println(a + " " + b);
          }
        }
      }
    }
}