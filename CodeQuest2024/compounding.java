import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int num  = Integer.parseInt(input.nextLine());
          double bal = 0;
          double sum = 0; 
          for(int i = 0; i < num; i++){
              String[] arr = input.nextLine().split(",");
              if(arr.length > 1 && !(arr[1].isEmpty())) bal += Double.valueOf(arr[1]);
              if(arr.length > 2 && !(arr[2].isEmpty())) bal -= Double.valueOf(arr[2]);
              sum += bal;
          }
          System.out.printf("$%.2f",(sum*.18)/(num*12));
          System.out.println();
          
      }
      }
    }
}