import java.util.*;
import java.math.*;

public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          double vol = input.nextDouble();
          double fill = input.nextDouble();
          double leak = input.nextDouble();
          double ans = (vol/(fill-leak))*leak;
          long ans2 = Math.round(ans);
          System.out.println(ans2);
          
      }
      }
    }
}