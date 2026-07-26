import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCases = Integer.parseInt(scanner.nextLine());
      for (int c= 0; c< testCases; c++) {
          int databaseCount = scanner.nextInt();
            int shipCount = scanner.nextInt();
            scanner.nextLine();
            List<String> database = new ArrayList<>();
            for(int i = 0; i < databaseCount; i++){
            database.add(scanner.nextLine());
            }
            
            for(int i = 0; i < shipCount; i++){
            database.remove(scanner.nextLine());
            }
            Collections.sort(database, String.CASE_INSENSITIVE_ORDER);
            for(String system : database){
            System.out.println(system);
            }
      }
      }
    }
}