import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          double d = input.nextDouble()*1000000;
          double s = input.nextDouble();
          BigDecimal bd1 =  new BigDecimal(String.valueOf(d/s));
          double what = d/s;
          //BigDecimal t4 =  new BigDecimal(24);
          int days = (bd1.divide(BigDecimal.valueOf(24))).intValue();
      System.out.println(days);
           int hours = (bd1.remainder(BigDecimal.valueOf(24))).intValue();
                 System.out.println(hours);
     what-=(days*24+hours);
           bd1 = bd1.subtract(BigDecimal.valueOf(days*24+hours));
        int min = (bd1.multiply(BigDecimal.valueOf(60))).intValue();
                 System.out.println(min);
                      System.out.println(what);
System.out.println();

        //   int sec = (int)(((bd1*60) - min) *60);
        //   System.out.println("Time to Mars: " + days + " days, " + hours + " hours, " + min + " minutes, " + sec + " seconds" );

      }
      }
    }
}