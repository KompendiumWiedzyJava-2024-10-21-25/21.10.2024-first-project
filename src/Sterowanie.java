public class Sterowanie {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }

        loop:for(int i = 0; i < 10; i++) {
            int a = 4;
            switch(a) {
                case 1:
                    break loop;
            }
        }
    }
}
