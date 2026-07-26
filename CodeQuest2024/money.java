import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String country = input.nextLine();
          HashMap<Integer, Double> map = new HashMap<Integer, Double>();
          ArrayList<Integer> yearList = new ArrayList<Integer>();
          int num = input.nextInt();
          input.nextLine();
          for(int i = 0; i < num; i++){
            double income = input.nextDouble();
            int year = input.nextInt();
            map.put(year, income);
            yearList.add(year);
          }
        input.nextLine();

          Collections.sort(yearList);
          System.out.println(country + ":");
          for(int i = 0; i < yearList.size(); i++){
              String starLine = " ";
              double gdp = map.get(yearList.get(i));
              int numStars = (int)((gdp/1000) + .5);
              for(int z = 0; z < numStars; z++){
                  starLine += "*";
              }
              System.out.println(yearList.get(i) + starLine);
          }
      }
      }
    }
}