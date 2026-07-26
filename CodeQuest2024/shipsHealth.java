import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int num = input.nextInt();
                    input.nextLine();

          HashMap<String, Integer> map  = new HashMap<String, Integer>();
          map.put("LOW", 1);
          map.put("MEDIUM", 2);
          map.put("HIGH", 3);
          double total = 0;
          double div = 0; //divide by 0 error?
          for(int i = 0; i < num ; i++){
              String line = input.nextLine();
              String lvl = line.substring(0, line.indexOf(" "));
              int n = Integer.valueOf(line.substring(line.indexOf(" ") + 1));
              total += map.get(lvl) * n;
              div += map.get(lvl);
          }
          double result = total/div;
          //System.out.println(result);
          int answer = (int)Math.round(result * 10);
          System.out.println(answer);
          
          
          
      }
      }
    }
}