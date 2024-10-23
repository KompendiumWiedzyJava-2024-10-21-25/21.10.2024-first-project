public class Zadanie1 {
    public static void main(String[] args) {
        int tabSize = 100;
        int[] tab = new int[tabSize];
        for(int i = 0; i < tabSize; i++) {
            tab[i] = i + 1;
            if(tab[i] % 5 == 0) {
                System.out.println(tab[i]);
            }
        }
    }
}
