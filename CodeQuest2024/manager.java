import java.util.*;
import java.lang.*;
import java.text.*;
import java.util.regex.Pattern;

public class MyProgram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int c = 0; c < testCases; c++) {
                Map<String, String> managers = new HashMap<>();
        List<String> employees = new ArrayList<>();
        int numManagers = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < numManagers; i++) {
            String manager = input.nextLine();
            int numEmployees = input.nextInt();
            input.nextLine(); 

            if (!employees.contains(manager)) {
                employees.add(manager);
            }

            for (int j = 0; j < numEmployees; j++) {
                String employee = input.nextLine();
                managers.put(employee, manager);
                if (!employees.contains(employee)) {
                    employees.add(employee);
                }
            }
        }

        Collections.sort(employees);

        for (String employee : employees) {
            System.out.print(employee);
            String current = employee;
            while (current != null) {
                current = managers.get(current);
                if (current != null) {
                    System.out.print("/");
                    System.out.print(current);
                }
            }
            System.out.println();
        }
            }
        }
    }
}