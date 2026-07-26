import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int n = input.nextInt(); // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods

          
          
      }
      }
    }
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 1)
        {
            System.out.println(from_rod + "->" + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println(from_rod + "->" + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }
}