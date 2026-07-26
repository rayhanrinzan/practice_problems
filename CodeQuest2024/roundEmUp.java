import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int l = input.nextInt();
          int w = input.nextInt();
          int h = input.nextInt();
          if(l % 2 == 0) l+= 2;
          else l += 1;
          if(w % 2 == 0) w+= 2;
          else w += 1;
          if(h % 2 == 0) h+= 2;
          else h += 1;
          System.out.println(l + " " + w + " " + h);
      }
      }
    }
}