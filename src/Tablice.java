public class Tablice {
    public static void main(String[] args) {
        int[] tab = new int[10];
        tab[0] = 67;
        tab[5] = 33;
        tab[9] = 50;

        System.out.println(tab[0]);
        System.out.println(tab[5]);
        System.out.println(tab[9]);

        String[] tab2 = new String[10];

        int[] tab3 = {1,2,3,4,5,6,7};

        System.out.println(tab3[0]);
        System.out.println(tab3[4]);
        System.out.println(tab3[6]);

        int i;
        int[] tab4;
        int[][] tab5 = new int[5][5];

        tab5[0][3] = 67;
        tab5[1][4] = 44;

        System.out.println(tab5[0][3]);
        System.out.println(tab5[1][4]);

        int[][][] tab3d = new int[3][3][3];
        tab3d[0][1][2] = 55;

        System.out.println(tab3d[0][1][2]);

        int[] innerTab = tab5[0];
        System.out.println(innerTab[3]);

        int[][] tab6 = {
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };

        int[][] tab7 = new int[3][3];
        tab7[0][0] = 1;
        tab7[0][1] = 2;
        tab7[0][3] = 3;
    }
}
