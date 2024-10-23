import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        Random losowacz = new Random();
        int[] tab = new int[100];
        int sum = 0;
        for(int i = 0; i < tab.length; i++) {
            tab[i] = losowacz.nextInt(0, 1001);
            System.out.print(tab[i] + " ");
            sum += tab[i];
        }
        System.out.println();

        double avg = ((double) sum) / ((double) tab.length);
        System.out.println("Srednia: " + avg);

        /*double a = 5.9;
        int b = (int) a;

        System.out.println(b);*/
    }
}
