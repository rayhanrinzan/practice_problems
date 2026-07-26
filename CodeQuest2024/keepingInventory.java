import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        Map<Character, Integer> sortOrder = new HashMap<>();
        sortOrder.put('/', 0);
        sortOrder.put('.', 1);
        sortOrder.put('-', 2);
        sortOrder.put('A', 3);
        sortOrder.put('B', 4);
        sortOrder.put('C', 5);
        sortOrder.put('D', 6);
        sortOrder.put('E', 7);
        sortOrder.put('F', 8);
        sortOrder.put('G', 9);
        sortOrder.put('H', 10);
        sortOrder.put('I', 11);
        sortOrder.put('J', 12);
        sortOrder.put('K', 13);
        sortOrder.put('L', 14);
        sortOrder.put('M', 15);
        sortOrder.put('N', 16);
        sortOrder.put('O', 17);
        sortOrder.put('P', 18);
        sortOrder.put('Q', 19);
        sortOrder.put('R', 20);
        sortOrder.put('S', 21);
        sortOrder.put('T', 22);
        sortOrder.put('U', 23);
        sortOrder.put('V', 24);
        sortOrder.put('W', 25);
        sortOrder.put('X', 26);
        sortOrder.put('Y', 27);
        sortOrder.put('Z', 28);
        sortOrder.put('0', 29);
        sortOrder.put('1', 30);
        sortOrder.put('2', 31);
        sortOrder.put('3', 32);
        sortOrder.put('4', 33);
        sortOrder.put('5', 34);
        sortOrder.put('6', 35);
        sortOrder.put('7', 36);
        sortOrder.put('8', 37);
        sortOrder.put('9', 38);

        int numLines = Integer.parseInt(input.nextLine());
                List<String> lines = new ArrayList<>();

                for (int i = 0; i < numLines; i++) {
                    lines.add(input.nextLine());
                }
                char charA;
                char charB;
                String stringA;
                String stringB;
                for(int d = 0; d < lines.size(); d++){  
                    for(int i = 1; i < lines.size(); i++){
                        stringA = lines.get(d);
                        stringB = lines.get(i);
                        for(int x = 0; x < Math.min(stringA.length(), stringB.length()); x++){
                         charA = stringA.charAt(x);
                         charB = stringB.charAt(x);
                            if(charA == 'O'){
                                charA = '0';
                            }
                            if(charB == 'O'){
                                charB = '0';
                            }
                            if(charA == charB){
                                continue;
                            }
                            if(sortOrder.get(charA) < sortOrder.get(charB)){
                                break;
                            }
                            if(sortOrder.get(charA) > sortOrder.get(charB)){
                                System.out.println(lines);
                            
                                lines.add(d, stringB);
                                if(d > i){
                                    lines.remove(i);
                                }
                                if(d < i){
                                    lines.remove(i+1);
                                }
                                break;
                            }
                        }
                    }
                }
                for (String line : lines) {
                    System.out.println(line);
                }   
      }
      }
    }
}