import java.util.Arrays;

public class ServerNameGenerator {

    static String[] adjectives = {"brave", "calm", "delightful", "eager", "faithful", "gentle", "happy", "jolly", "kind", "lively"};
    static String[] nouns = {"week", "company", "system", "program", "question", "work", "government", "number", "night", "point"};

    static String adjective = adjectives[(int) (Math.random() * adjectives.length)];
    static String noun = nouns[(int) (Math.random() * nouns.length)];

    public static void main(String[] args) {

//        System.out.println("Your random adjective is: " + adjective);
//        System.out.println("Your random noun is: " + noun);

        System.out.println("Here is your server name:");
        System.out.println(adjective + "-" + noun);

    }

/////////////////////////////////////////////////    NOTES

//    public static void main(String[] args) {
//
////        ARRAYS NEED TO BE FILLED WITH ALL THE SAME TYPE
//
//        String[] instructors = new String[5];
//        instructors[0] = "Justin";
//        instructors[1] = "Fer";
//        instructors[2] = "Ryan";
//        instructors[3] = "Zach";
////        OR
////        String[] instructors = {"Justin", "Fer", "Ryan", "Zach"};
//
//        System.out.println(instructors[1]);
//        System.out.println(instructors[4]);
//
//
//        int[] numbers = new int[3];
//        numbers[0] = 7;
//        numbers[1] = 10;
////        OR
////        int[] numbers = {7, 10};
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[2]);
//
////        FOR LOOPS
//
//        for (int i = 0; i < numbers.length; i += 1) {
//
//            System.out.println(numbers[i]);
//
//        }
//
////        ENHANCED FOR LOOP
//
//        for (String instructor : instructors) {
//
//            System.out.println(instructor);
//
//        }
//
////        USE FOR TIC TAC TOE
//
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        System.out.println(matrix[2][0]);
//
//        for (int[] row : matrix) {
//            System.out.println("+---+---+---+");
//            System.out.print("| ");
//            for (int n : row) {
//                System.out.print("  | ");
//            }
//            System.out.println();
//        }
//        System.out.println("+---+---+---+");
//
//    }

}

//////////////////////////////// NOTES

//public class BandMember {
//
//    private String name;
//
//    public BandMember(String name) {
//
//        this.name = name;
//
//    }
//
//    public String getName() {
//
//        return name;
//
//    }
//
//    public void setName() {
//
//        this.name = name;
//
//    }
//
//    public static void main(String[] args) {
//
//        final int NUMBER_OF_BEATLES = 4;
//        BandMember[] theBeatles = new BandMember[][NUMBER_OF_BEATLES];
//
//        theBeatles[0] = new BandMember("John");
//        theBeatles[1] = new BandMember("Paul");
//        theBeatles[2] = new BandMember("George");
//        theBeatles[3] = new BandMember("Ringo");
//
//        System.out.println(theBeatles[2].getName());
//
//    }
//
//}