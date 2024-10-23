import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        Random losowacz = new Random();
        int max = 0, resultRow = 0, resultCol = 0;
        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < 10; col++) {
                tab[row][col] = losowacz.nextInt(0, 1001);
                System.out.print(tab[row][col] + " ");
                if(tab[row][col] > max) {
                    max = tab[row][col];
                    resultRow = row;
                    resultCol = col;
                }
            }
            System.out.println();
        }
        System.out.println("Max: " + max);
        System.out.println("Row: " + resultRow + " Col: " + resultCol);
    }
}
