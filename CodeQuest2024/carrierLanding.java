import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
            int num = Integer.parseInt(input.nextLine());
            for(int i = 0; i < num; i++){
                String name = input.nextLine();
                String line1 = input.nextLine();
                String line2 = input.nextLine();
                String line3 = input.nextLine();
                String[] plane = line1.split(",");
                String[] start = line2.split(",");
                String[] end = line3.split(",");
                int x1 = Integer.valueOf(plane[0]);
                int y1 = Integer.valueOf(plane[1]);
                int x2 = Integer.valueOf(start[0]);
                int y2 = Integer.valueOf(start[1]);
                double slope1 = 1.0*(y2 - y1)/(x2 - x1);
                x2 = Integer.valueOf(end[0]);
                y2 = Integer.valueOf(end[1]);
                double slope2 = 1.0*(y2 - y1)/(x2 - x1);
                if((slope1<= -.8 && slope1 >= -1.6) && (slope2<= -.8 && slope2 >= -1.6)){
                    System.out.println(name + ", Clear To Land!");
                }
                else{
                    System.out.println(name + ", Abort Landing!");
                }
            }

          
          
      }
      }
    }
}