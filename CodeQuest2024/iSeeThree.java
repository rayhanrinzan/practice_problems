import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String line = input.nextLine();
          boolean triplet = false;
          String[] arr = line.split(" ");
          String temp;
          int count;
          for(int i = 0; i < arr.length; i++){
              temp = arr[i];
              arr[i] = "NO";
              count = 1;
              for(int x = 0; x < arr.length; x++){
                  if(arr[x].equals(temp)){
                      
                      count++;
                  }
              }
              if(count == 3){
                  triplet = true;
                  break;
              }
              arr[i] = temp;
          }
          if(triplet) System.out.println("TRUE");
          else System.out.println("FALSE");
          
      }
      }
    }
}