package pizzaPlanet;

import java.util.Scanner;

public class pizzaPlanet {
    private final Scanner scanner = new Scanner(System.in);
    private final menu menu = new menu();
    private final coupons coupons = new coupons();

    private void navigation(int choice){
        switch(choice){
            case 1:
            {
                menu.drawMenu();
                menu.getOrder();
                break;
            }
            case 2:
            {
                coupons.drawCoupons();
                break;
            }
            case 3:
            {
                //work
                break;
            }
            case 4:
            {
                //contact
                break;
            }
            case 5:
            {
                //leaving
                break;
            }
            default:
            {
                System.out.println("Ooops! Something went wrong!");
            }
        }
    }

    public void welcome() {
        System.out.println("------WELCOME IN PIZZA PLANET------");
        System.out.println("1. Menu");
        System.out.println("2. Buy coupons");
        System.out.println("3. Apply for a work");
        System.out.println("4. Contact");
        System.out.println("5. Leave\n");
        System.out.println("Choice: ");
        int choice = scanner.nextInt();
        //clear screen here
        navigation(choice);
    }
}
