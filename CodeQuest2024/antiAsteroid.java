import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int z = input.nextInt();
          ArrayList<Double> arrList = new ArrayList<Double>();
          HashMap<Double, String> map = new HashMap<Double, String>();
          for(int i = 0; i < z; i++){
              int x = input.nextInt();
              int y = input.nextInt();
              String put = String.valueOf(x) + " " + String.valueOf(y);
              double distance = Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));
              arrList.add(distance);
              map.put(distance, put);
              
          }
          Collections.sort(arrList);
          for(int i = 0; i < arrList.size(); i++){
              System.out.println(map.get(arrList.get(i)));
          }
      }
      }
    }
}