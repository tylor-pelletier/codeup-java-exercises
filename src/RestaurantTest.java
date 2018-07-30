public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 1395;
        dish.nameOfDish = "Chicken Parmesan";
        dish.wouldRecommend = true;

        System.out.println("The dish costs " + dish.costInCents + " cents.");
        System.out.println(dish.nameOfDish + " is the name of the dish.");
        if (dish.wouldRecommend) {
            System.out.println("I would recommend this dish!");
        } else {
            System.out.println("I would not recommend this dish.");
        }
        System.out.println(dish.eat());

    }

}