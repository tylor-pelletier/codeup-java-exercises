public class BurgerTester {

    public static void main(String[] args) {

        System.out.println("The most popular topping is " + BurgerTools.setMostPopularTopping("Cheese") + ".");

        System.out.println("The average amount of days before expiration is " + BurgerTools.setAverageDaysBeforeExpiration(4) + " days.");

        System.out.println("The burger's internal temperature should be " + BurgerTools.setTemperatureWhenCooked(160) + "˚F when done cooking.");

        BurgerTools.grill();

    }

}