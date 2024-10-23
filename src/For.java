public class For {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i = 0; i < tab.length; i++) {
            tab[i] = i*10;
        }

        for(int x : tab) {
            System.out.println(x);
        }

        System.out.println("Koniec programu !!");
    }
}
