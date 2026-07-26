import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int c = 0; c < testCases; c++) {
                String[] dimensions = input.nextLine().split(" ");
                int rows = Integer.parseInt(dimensions[0]);
                int columns = Integer.parseInt(dimensions[1]);
                char[][] array = new char[rows][columns];

                for (int i = 0; i < rows; i++) {
                    String line = input.nextLine();
                    for (int j = 0; j < columns; j++) {
                        array[i][j] = line.charAt(j * 2);
                    }
                }

                int num = Integer.parseInt(input.nextLine());

                for (int i = 0; i < num; i++) {
                    String str = input.nextLine();
                    boolean found = false;

                    for (int b = 0; b < rows && !found; b++) {
                        for (int j = 0; j < columns && !found; j++) {
                            if (array[b][j] == str.charAt(0)) {
                                if (worm(array, str, 0, b, j)) {
                                    System.out.println(str);
                                    found = true;
                                }
                            }
                        }
                    }

                }
            }
        }
    }

    public static boolean worm(char[][] arr, String s, int strIndex, int row, int col){
        if (strIndex == s.length() - 1){
            return true;
        } 
        else {
            char n = s.charAt(strIndex + 1);

            int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

            for (int d = 0; d < 8; d++) {
                int newRow = row + dr[d];
                int newCol = col + dc[d];

                if (newRow >= 0 && newRow < arr.length && newCol >= 0 && newCol < arr[0].length
                        && arr[newRow][newCol] == n){
                    if (worm(arr, s, strIndex + 1, newRow, newCol)){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}