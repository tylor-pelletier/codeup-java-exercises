public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int myFavoriteNumber = 10;
        System.out.println("My favorite number is: " + myFavoriteNumber);
        String myString = "Ten";
        System.out.println(myString);
        double myNumber = 3.14;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

//        Convert
//
//        int x = 4;
//        x = x + 5;
//          x += 5;
//
//        int x = 3;
//        int y = 4;
//        y = y * x;
//          y *= x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//          x /= y;
//          y -= x;


//        Always use lowercase for variables so you don't confuse them with classes

        byte streetPop = 10;
        short cityPop = 10100;
        int statePop = 2200100;
//        For long, add an L at the end of a really large number inside the scope to work
        long countryPop = 300200100;
        long continentPop = 400300200100L;
//        Use doubles instead of floats. If you need to use floats, add an F at the end of the number
        float price = 79.85F;
        System.out.println("Total: " + (price + 1.0F));
        double grade = 98.60;
        char letter = 'T';
        boolean trueOrFalse = true;
//        Constant variables can't be modified. Add final in front of it
        final int pages = 10;

//        Implicit Casting
        double morePrecise = statePop;
        System.out.println("State Population: " + statePop);
        System.out.println("Percise State Population: " + morePrecise);

//        Explicit Casting
//        Truncates the number. Doesn't round
        int wholeGrade = (int) grade;
        System.out.println(wholeGrade);

        System.out.println(streetPop);
        System.out.println(cityPop);
        System.out.println(countryPop);
        System.out.println(continentPop);
        System.out.println(letter);
        System.out.println(trueOrFalse);
        System.out.println(pages);


//        Declaration:
//        type variableName;
//
//        Initialization:
//        variableName = value;
//
//        Declaration and Initialization:
//        type variableName = value;


//        Type: Bytes:  Description:
//
//        byte      1	Integers from -128 to 127
//        short     2	Integers from -32,768 to 32,767
//        int	    4	Integers from -2,147,483,648 to 2,147,483,647
//        long	    8	Integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	    4	Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
//        double	8	Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
//        char	    2	A single Unicode character that’s stored in two bytes
//        boolean	1	A true or false value


//        Reserved Words:
//
//        abstract assert boolean break byte case catch char class const continue default do double else enum extends
//        final finally float for goto if implements import instanceof int interface long native new package private
//        protected public return short strictfp static super switch synchronized this throw throws transient try void
//        volatile while

    }

}