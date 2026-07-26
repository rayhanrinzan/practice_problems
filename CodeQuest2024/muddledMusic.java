import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int num = input.nextInt();
          
          ArrayList<String> musicList = new ArrayList<String>(); 
          HashMap<String, String> phonebook = new HashMap<String, String>();
          for(int i = 0; i < num; i++){
              String[] arr = input.nextLine().split(" - ");
              System.out.println(arr[0] + arr[1]);
              //musicList.add(arr[0]);
              //phonebook.put(arr[0], arr[1]);
          }
          //sort
          //go through hashmap and print
          
          
      }
      }
    }
}