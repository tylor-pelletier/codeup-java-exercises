package util;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println("Enter a string");
        System.out.println(input.getString());

        System.out.println("Enter yes or no");
        System.out.println(input.yesNo());

        System.out.println(input.getInt(0, 10));

        input.getInt("Enter an integer");

        System.out.println(input.getDouble(0, 10));

        input.getDouble("Enter a decimal");

    }

}