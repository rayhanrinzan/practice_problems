import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          double savings = 0.0;
          ArrayList<Double> nums = new ArrayList<Double>();
          int n = input.nextInt();
          DecimalFormat df = new DecimalFormat("0.00##");
          for(int i = 0; i < n; i++){
              double num = input.nextDouble();
              if(num%1.00 != 0){
                  int m = (int)num + 1;
                  //System.out.println(m);
                  double remainder = m - num;
                  //System.out.println(num + "    " +m);
                 // System.out.println(df.format(remainder));
                  num += 1.0;
                  num = Math.floor(num);
                  savings += Double.valueOf(df.format(remainder));
                  nums.add(num);
              }
              else{
                  nums.add(num);
              }
          }
          for(int i = 0; i< nums.size(); i++){
              System.out.println(Math.round(nums.get(i)));
          }
          String result = String.format("%.2f", savings);

          System.out.println(result);
          
          
      }
      }
    }
}