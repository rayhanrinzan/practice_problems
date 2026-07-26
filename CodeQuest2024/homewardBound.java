import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int n = Integer.parseInt(input.nextLine());
          ArrayList<String> startList = new ArrayList<String>();
          ArrayList<String> endList = new ArrayList<String>();
          HashMap<String, String> map = new HashMap<String, String>();

          for(int i = 0; i < n; i++){
              String[] temp = input.nextLine().split(" ");
              String one = temp[0];
              String two = temp[1];
              startList.add(two);
              endList.add(one);
              map.put(two, one);
          }
          String start = "";
          for(int i = 0; i < startList.size(); i++){
          if(!(endList.contains(startList.get(i)))){
              start = startList.get(i);
              System.out.println(start);
              
          }
          }
          for(int i = 0; i < n; i++){
              System.out.println(map.get(start));
              start = map.get(start);
          }
      }
          
          
          
          
      }
    }
}