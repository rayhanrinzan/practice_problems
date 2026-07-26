import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String str = input.nextLine();
          String str2 = input.nextLine();

          String[] arr1 = str.split(" ");
          String[] arr2 = str2.split(" ");
          ArrayList<Integer> mult = new ArrayList<Integer>();
          for(int i = 0; i < arr1.length; i++){
              if((Double.valueOf(arr1[i]) >= .6 && Double.valueOf(arr1[i]) <= .85) && (Double.valueOf(arr2[i]) >= .6 && Double.valueOf(arr2[i]) <= .85)){
                  mult.add(i);
              }
          }
          if(mult.size() == 0) System.out.println("No multipaction events detected.");
          else if(mult.size() == 1) System.out.println("A multipaction event was detected at time index " + String.valueOf(mult.get(0)) + ".");
          else{
              System.out.print(String.valueOf(mult.size()) + " multipaction events were detected at time indices:");
              for(int i = 0; i< mult.size(); i++){
                  System.out.print(" " + String.valueOf(mult.get(i)));
              }
              System.out.println(".");
          }
          
      }
      }
    }
}