package util;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

        System.out.println(input.getString("Enter a letter, word or sentence: "));

        System.out.println(input.yesNo());

        System.out.println(input.getInt(0, 10));

        System.out.println(input.getInt());

        System.out.println(input.getDouble(0, 10));

        System.out.println(input.getDouble());

    }

}