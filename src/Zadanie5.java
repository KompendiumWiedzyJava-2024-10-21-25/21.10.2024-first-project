import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        Random losowacz = new Random();
        int[][] tab = new int[10][10];
        double max = 0;
        int maxRow = 0;
        for(int row = 0; row < 10; row++) {
            int sum = 0;
            for(int col = 0; col < 10; col++) {
                tab[row][col] = losowacz.nextInt(0, 1001);
                System.out.print(tab[row][col] + " ");
                sum += tab[row][col];
            }
            double avg = sum / 10.0;
            if(avg > max) {
                max = avg;
                maxRow = row;
            }
            System.out.println();
        }

        System.out.println("Max avg: " + max);
        System.out.println("Row: " + maxRow);
    }
}
