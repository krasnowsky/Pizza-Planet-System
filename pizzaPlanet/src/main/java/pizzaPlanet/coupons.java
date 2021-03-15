package pizzaPlanet;

public class coupons {
    private String[] coupons = new String[]{"Small Salami - 10$", "Big Hawai - 15$", "Coca-Cola - 3$"};

    public void drawCoupons() {
        System.out.println("------AVAILABLE COUPONS------");
        for (int i = 0; i < coupons.length; i++) {
            System.out.println(i + 1 + ". " + coupons[i]);
        }
        System.out.println(coupons.length + 1 + ". Go back");
    }
}
