import java.util.*;
import java.lang.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          
          double angle = input.nextDouble();
          double sen1 = input.nextDouble();
          double sen2 = input.nextDouble();
          if(Math.abs(sen1-sen2) > 5.0){
              System.out.println("WARNING");
          }
          else if(((sen1+sen2)/2 - angle) >= 2.0){
              System.out.println("ALARM");
          }
          else{
              System.out.println("OK");
          }
          
          
      }
      }
    }
}