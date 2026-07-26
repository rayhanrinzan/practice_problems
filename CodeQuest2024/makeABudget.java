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
        HashMap<String, Integer> budget = new HashMap<String, Integer>();
        for(int i = 0; i < n1; i++){
            String[] arr = input.nextLine().split(" ");
            budget.put(arr[0], Integer.valueOf(arr[1]));
        }
        for(int i = 0; i < n2; i++){
            String line= input.nextLine();
            String[] arr;
            if(line.contains("+")){
                arr = line.split(" \\+ ");
                String category = arr[0];
                int trans = Integer.valueOf(arr[1]);
                budget.put(category, (budget.get(category) + trans));
                System.out.println("YES");
                
                
                
            }
            else{
                arr = line.split(" \\- ");
                String category = arr[0];
                int trans = Integer.valueOf(arr[1]);
                if((budget.get(category) - trans) >= 0){
                    budget.put(category, (budget.get(category) - trans));
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }

          
          
      }
      }
    }
}