import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int num = Integer.parseInt(input.nextLine());
        String[] budget = input.nextLine().split(" ");
        String[] actual = input.nextLine().split(" ");
        double sum= 0;
        for(int i=0 ; i < budget.length; i++){
            sum += (Double.valueOf(actual[i]) - Double.valueOf(budget[i]));
        }
        System.out.printf("%.2f", sum/num);
        System.out.println();

          
          
      }
      }
    }
}