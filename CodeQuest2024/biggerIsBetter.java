import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String line = input.nextLine();
          //if(line.length() > 1){
             String[] arr = line.split(" ");
             int biggest = Integer.MIN_VALUE;
             for(int i = 0; i < arr.length; i++){
                 if(Integer.valueOf(arr[i]) >= biggest){
                     biggest = Integer.valueOf(arr[i]);
                 }
             }
             System.out.println(biggest);
          //}
          
          
      }
      }
    }
}