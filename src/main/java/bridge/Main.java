package bridge;

public class Main {
    public static void main(String[] args) {
        Gift g = new WarmGift(new Flower());
        give(g);
    }
    public static void give(Gift g){
        System.out.println(g + "gived");
    }
}
