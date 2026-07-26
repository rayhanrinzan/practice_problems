import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int n = Integer.parseInt(input.nextLine());
    
        ArrayList<String> IPs = new ArrayList<String>();
        HashMap<String, Integer> freq = new HashMap<String, Integer>();
        HashMap<String, ArrayList<String>> macs = new HashMap<String, ArrayList<String>>();
        for(int i = 0; i < n ; i++){
            String[] arr = input.nextLine().split(" ");
            if(!(IPs.contains(arr[0]))){
                IPs.add(arr[0]);
                freq.put(arr[0], 1);
                ArrayList<String> arrList = new ArrayList<String>();
                arrList.add(arr[1]);
                macs.put(arr[0], arrList);
            }
            else{
                if(!(macs.get(arr[0]).contains(arr[1]))){
                    freq.put(arr[0], freq.get(arr[0]) + 1);
                    macs.get(arr[0]).add(arr[1]);
                }
            }
        }
        
        Collections.sort(IPs, (ip1, ip2) -> {
            String[] ipParts1 = ip1.split("\\.");
            String[] ipParts2 = ip2.split("\\.");
        
            for (int j = 0; j < 4; j++) {
                int part1 = Integer.parseInt(ipParts1[j]);
                int part2 = Integer.parseInt(ipParts2[j]);
        
                if (part1 != part2) {
                    return Integer.compare(part1, part2);
                }
            }
        
            return 0; 
        });
        
        for(int i = 0; i < IPs.size(); i++){
            System.out.print(IPs.get(i));
            System.out.print(" " + freq.get(IPs.get(i)));
            System.out.println();
        }
        

          
          
      }
      }
    }
}