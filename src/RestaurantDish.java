public class RestaurantDish {

//    private int costInCents;
//    private String nameOfDish;
//    private boolean wouldRecommend;
//    private String eat() {
//        return "Nom nom nom!";
//    }

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    public String eat() {

        return "Nom nom nom!";

    }

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {

        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;

    }

    public int setCostInCents(int costInCents) {

        this.costInCents = costInCents;
        return costInCents;

    }

    public int getCostInCents() {

        return costInCents;

    }

    public String setNameOfDish(String nameOfDish) {

        this.nameOfDish = nameOfDish;
        return nameOfDish;

    }

    public String getNameOfDish() {

        return nameOfDish;

    }

    public boolean setWouldRecommend(boolean wouldRecommend) {

        this.wouldRecommend = wouldRecommend;
        return wouldRecommend;

    }

    public boolean isWouldRecommend() {

        return wouldRecommend;

    }

}