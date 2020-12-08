public class Dish {

    public String nameOfDish;
    public int costInCents;
    public boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("name: %s%nCost: %d%nRecommended: ", nameOfDish, costInCents, wouldRecommend);
    }


}
