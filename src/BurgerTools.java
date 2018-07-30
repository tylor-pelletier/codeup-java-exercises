public class BurgerTools {

    public static String mostPopularTopping;
    public static int averageDaysBeforeExpiration;
    public static int temperatureWhenCooked;
    public static void grill() {
        System.out.println("Grilling");
    }

    public static String setMostPopularTopping(String mostPopularTopping) {
        BurgerTools.mostPopularTopping = mostPopularTopping;
        return mostPopularTopping;
    }

    public static int setAverageDaysBeforeExpiration(int averageDaysBeforeExpiration) {
        BurgerTools.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
        return averageDaysBeforeExpiration;
    }

    public static int setTemperatureWhenCooked(int temperatureWhenCooked) {
        BurgerTools.temperatureWhenCooked = temperatureWhenCooked;
        return temperatureWhenCooked;
    }

}