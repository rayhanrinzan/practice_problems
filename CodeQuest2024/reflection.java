import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int c = 0; c < testCases; c++) {
                int num = Integer.parseInt(input.nextLine());
                ArrayList<String> arr = new ArrayList<String>();
                for (int i = 0; i < num; i++) {
                    String temp = input.nextLine();
                    arr.add(temp);
                }

                String opp = input.nextLine();

                 if(opp.equals("X")){
              for(int i = arr.size()-1; i >=0; i--){
                  System.out.println(arr.get(i));
              }
          }
          else if(opp.equals("Y")){
              for(int i = 0; i < arr.size(); i++){
                StringBuilder hello = new StringBuilder();
                hello.append(arr.get(i));
                hello.reverse();
                System.out.println(hello);

              }
             }
                 else if (opp.equals("INVERSE")) {
                    String str;
                    String longestString = arr.get(0);
                    for (String element : arr) {
                        if (element.length() > longestString.length()) {
                            longestString = element;
                        }
                    }
                    char[][] oGrid = new char[num][longestString.length()];
                    for (int i = 0; i < arr.size(); i++) {
                        str = arr.get(i);
                        for (int x = 0; x < str.length(); x++) {
                            oGrid[i][x] = str.charAt(x);
                        }
                    }
                    char[][] nGrid = new char[longestString.length()][num];
                    for (int i = 0; i < oGrid.length; i++) {
                        for (int x = 0; x < oGrid[i].length; x++) {
                            nGrid[x][i] = oGrid[i][x];
                        }
                    }
                    for (int i = 0; i < nGrid.length; i++) {
                        StringBuilder lineBuilder = new StringBuilder();
                        for (int x = 0; x < nGrid[i].length; x++) {
                            char ch = (nGrid[i][x]);
                            lineBuilder.append(ch);
                        }
                        String line = lineBuilder.toString();
                        if (!line.trim().isEmpty()) {
                            System.out.println(line);
                        }
                    }
                }
            }
        }
    }
}