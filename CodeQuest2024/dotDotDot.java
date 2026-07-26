import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String str = input.nextLine();
          String[] arr = {"a", "b", "c", "d", "e","f", "g", "h", "i", "j","k", "l", "m", "n", "o","p", "q", "r", "s", "t","u","v","w","x","y","z"};
          int num = 0;
          for(int i = 0; i < str.length(); i++){
              for(int x = 0; x < arr.length; x++){
                  if(arr[x].equals(str.substring(i, i+1))){
                      num += x+1;
                  }
              }
          }
          System.out.println(num);
      }
      }
    }
}