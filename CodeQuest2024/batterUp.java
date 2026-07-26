import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          HashMap<String, Integer> values = new HashMap<String, Integer>();
          values.put("K", 0);
          values.put("1B", 1);
          values.put("2B", 2);
          values.put("3B", 3);
          values.put("HR", 4);
          String line = input.nextLine();
          String name = line.substring(0, line.indexOf(":"));
          String bats = line.substring(line.indexOf(":") +1);
         // System.out.println(bats);
          String[] atBats = bats.split(",");
          double avg = 0;
          int div = atBats.length;
          if(bats.length() == 0){
               System.out.println(name + "=0.000");
               continue;
          }
          if(div == 0){
               System.out.println(name + "=0.000");
               continue;
          }
          for(int i =0; i < atBats.length; i++){
              if(atBats[i].equals("BB")){
                  div -= 1;
              }
              else{
              avg += values.get(atBats[i]);
              }
              //System.out.println(atBats[i]);
          }
          
         
         
           if(bats.length() != 0 && div != 0){
               avg /= div;
               String result = String.format("%.3f", avg);
               System.out.println(name + "=" + result);
           }
           else{
               System.out.println(name + "=0.000");
           }

          
          
      }
      }
    }
}