import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
         HashMap<Integer, Integer> jit = new HashMap<Integer, Integer>();
         ArrayList<String> what = new ArrayList<String>();
         HashMap<String, String> whatMap = new HashMap<String, String>();
        while(num1 != 1){
            if(num1%2 != 0){
                pairs.put(num1, num2);
                nums.add(num1);
                num1/=2;
                num2*=2;
                
            }
            else{
                jit.put(num1, num2);
                nums.add(num1);
                num1/=2;
                num2*=2;
            }
        }
        if(num1%2 != 0){
            pairs.put(num1, num2);
            nums.add(num1);
        }
        boolean asterisk = false;
        for(int i = 0; i < nums.size(); i++){
            if(asterisk){
                what.add(String.valueOf(nums.get(i)) + "*");
                if(nums.get(i) % 2 != 0){
                    asterisk =true;
                    whatMap.put(String.valueOf(nums.get(i)) + "*", String.valueOf(pairs.get(nums.get(i))));
                }
                else{
                    asterisk = false;
                    whatMap.put(String.valueOf(nums.get(i)) + "*", String.valueOf(jit.get(nums.get(i))) +" ***");
                }
            }
            else{
            what.add(String.valueOf(nums.get(i)));
            if(nums.get(i) % 2 != 0){
                asterisk = true;
                whatMap.put(String.valueOf(nums.get(i)), String.valueOf(pairs.get(nums.get(i))));
            }
            else{
                asterisk = false;
                whatMap.put(String.valueOf(nums.get(i)), String.valueOf(jit.get(nums.get(i)))+ " ***");
            }
            }
        }
        
        for(int i = 0; i < what.size(); i++){
            System.out.print(what.get(i)+" ");
            System.out.println(whatMap.get(what.get(i)));
        }
        
        
        int sum = 0; 
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) % 2 != 0) sum += pairs.get(nums.get(i));
        }
        System.out.println(sum);
        
      }
      }
    }
}