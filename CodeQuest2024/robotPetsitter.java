import java.util.Scanner;
public class MyProgram{
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int i= 0; i< testCases; i++) {
      String line = input.nextLine();
      int u, d, r, l;
      u = d = r = l = 0;
      for(int x = 0; x < line.length(); x++){
          if(line.substring(x, x+1).equals("U")) u += 1;
          else if(line.substring(x, x+1).equals("D")) d += 1;
          else if(line.substring(x, x+1).equals("R")) r += 1;
          else l += 1;
      }
      if(((u-d) == 0) && ((r-l) == 0)) System.out.println("TRUE");
      else System.out.println("FALSE");
      }
    }
  }
}