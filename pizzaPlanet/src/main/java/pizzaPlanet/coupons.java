package pizzaPlanet;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class coupons {
    private final String[] coupons = new String[]{"Small Salami - 10$", "Big Hawai - 15$", "Coca-Cola - 3$", "Chips - 7$", "Big Meal Pizza + Coca-Cola - 20$"};
    private final boolean[] isTaken = new boolean[coupons.length];
    private int couponChoice;
    Scanner scan = new Scanner(System.in);
    StringBuilder strBuilder = new StringBuilder();


    public void drawCoupons() {
        System.out.println("------AVAILABLE COUPONS------");
        for (int i = 0; i < coupons.length; i++) {
            if(!isTaken[i]) System.out.println(i + 1 + ". " + coupons[i]);
        }
        System.out.println(coupons.length + 1 + ". Go back");
    }

    public boolean pickCoupons() {
        System.out.println("Choice: ");
        couponChoice = scan.nextInt();
        if(couponChoice == coupons.length + 1) return true;
        if(isTaken[couponChoice - 1]) {
            System.out.println("Coupon number " + couponChoice + " was already picked by you.");
        }
        else {
            isTaken[couponChoice - 1] = true;
            System.out.println("You have taken: " + coupons[couponChoice - 1]);
            System.out.println("Thank you for picking coupon!");
            strBuilder.append(coupons[couponChoice - 1] + "\n");
        }
        return false;
    }

    public boolean couponsReady() {
        System.out.println("Do you want to pick any more coupons? [Y/N]");
        String needMore = scan.next();

        if(needMore.equals("y")) {
            return true;
        }

        else {
            System.out.println("Maybe next time :/");
            return false;
        }
    }

    public void saveCoupons() {
        try(PrintWriter out = new PrintWriter("coupons.txt")) {
            out.println(strBuilder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
