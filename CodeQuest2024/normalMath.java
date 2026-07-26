import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        input.nextLine();
        ArrayList<Integer> values = new ArrayList<Integer>();
        for(int i = 0; i < n1; i++){
            for(int ii = 0; ii < n2; ii++){
                values.add(input.nextInt());
            }
            input.nextLine();
        }
        for(int i = 0; i < values.size(); i++){
            values.set(i, (int)Math.pow(Math.abs(values.get(i)), 2));
        }
        int sum = 0;
        for(int i = 0; i < values.size(); i++){
            sum += values.get(i);
        }
        double ans = Math.sqrt(sum);
        System.out.printf("%.2f", ans);
        System.out.println();
      }
      }
    }
}