import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int cass = input.nextInt();
          int lead = input.nextInt();
          if(cass > lead) System.out.println("Cassowary Craft sold " + String.valueOf((cass-lead)) +" more aircraft");
          else if(lead > cass) System.out.println("Lead Balloons Ltd sold " + String.valueOf((lead-cass)) +" more aircraft");
          else System.out.println("Cassowary Craft and Lead Balloons Ltd sold the same number of aircraft");
          
      }
      }
    }
}