import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Double> list = new ArrayList<Double>();
        for(int i = 0; i < n; i++){
            list.add(Double.parseDouble(input.nextLine()));
        }
        ArrayList<Double> oldList = new ArrayList<Double>();
        for(int i = 0; i<list.size(); i++){
            oldList.add(list.get(i));
        }
        Collections.sort(list);
        double min = list.get(0);
        double max = list.get(list.size()-1);
        for(int i = 0; i < oldList.size(); i++){
           double ans = Math.round(((oldList.get(i) - min)/(max-min))*255);
           System.out.println((int)ans);
        }
        
          
      }
      }
    }
}