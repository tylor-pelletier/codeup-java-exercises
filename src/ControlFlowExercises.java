public class ControlFlowExercises {

    public static void main(String[] args) {

        // 1
        int i = 5;
        while (i <= 15) {
            System.out.printf("%s ", i);
            i += 1;
        }

        System.out.println(" ");

        int j = 0;
        do {
            System.out.printf("%s ", j);
            j += 2;
        } while (j <= 100);

        System.out.println(" ");

        int x = 100;
        do {
            System.out.printf("%s ", x);
            x -= 5;
        } while (x >= -10);

        System.out.println(" ");

        long y = 2;
        do {
            System.out.printf("%s ", y);
            y *= y;
        } while (y <= 1000000);

        System.out.println(" ");

        for (i = 5; i <= 15; i +=1) {
            System.out.printf("%s ", i);
        }

        System.out.println(" ");

        for (j = 0; j <=100; j += 2) {
            System.out.printf("%s ", j);
        }

        System.out.println(" ");

        for (x = 100; x >= -10; x -= 5) {
            System.out.printf("%s ", x);
        }

        System.out.println(" ");

        for (y = 2; y <= 1000000; y *= y) {
            System.out.printf("%s ", y);
        }

    }

}
