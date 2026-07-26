import java.util.Scanner;

public class MyProgram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < testCases; i++) {
            String[] dimensions = scanner.nextLine().split(" ");
            int rows = Integer.parseInt(dimensions[0]);
            int columns = Integer.parseInt(dimensions[1]);
            int bombs = Integer.parseInt(dimensions[2]);

            int[][] b = new int[bombs][2];
            for (int x = 0; x < bombs; x++) {
                String[] bombCoordinates = scanner.nextLine().split(" ");
                b[x][0] = Integer.parseInt(bombCoordinates[0]);
                b[x][1] = Integer.parseInt(bombCoordinates[1]);
            }

            for (int r = 0; r < rows; r++) {
                StringBuilder temp = new StringBuilder();
                for (int c = 0; c < columns; c++) {
                    boolean isBomb = false;
                    for (int[] bomb : b) {
                        if (bomb[0] == r && bomb[1] == c) {
                            isBomb = true;
                            break;
                        }
                    }

                    if (isBomb) {
                        temp.append('*');
                        continue;
                    }

                    int[][] neighbors = {
                            {r - 1, c - 1}, {r - 1, c}, {r - 1, c + 1},
                            {r, c - 1},                 {r, c + 1},
                            {r + 1, c - 1}, {r + 1, c}, {r + 1, c + 1}
                    };

                    int bombCount = 0;
                    for (int[] neighbor : neighbors) {
                        for (int[] bomb : b) {
                            if (neighbor[0] == bomb[0] && neighbor[1] == bomb[1]) {
                                bombCount++;
                                break;
                            }
                        }
                    }

                    temp.append(bombCount);
                }
                System.out.println(temp);
            }
        }
    }
}