import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          double temp = input.nextDouble();
          boolean water = input.nextBoolean();
          boolean field = input.nextBoolean();
          double ecc = input.nextDouble();
          if(temp > 100.0) System.out.println("The planet is too hot.");
          else if(temp < 0.0) System.out.println("The planet is too cold.");
          else if(!(water)) System.out.println("The planet has no water.");
          else if(!(field)) System.out.println("The planet has no magnetic field.");
          else if(ecc > .6) System.out.println("The planet's orbit is not ideal.");
          else System.out.println("The planet is habitable.");
      }
      }
    }
}