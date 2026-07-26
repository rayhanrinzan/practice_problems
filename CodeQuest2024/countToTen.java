import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int num = input.nextInt();
        int num2 = (int)Math.pow(10 ,1.0*(num-1));
        System.out.println(num);
        String binary = "";
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < num; i++){
            binary += "0";
        }
        list.add(binary);
        for(int i = 0; i < num; i++){
            
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
      }
      }
    }
}