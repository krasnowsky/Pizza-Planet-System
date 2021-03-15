package pizzaPlanet;

import java.util.Scanner;

public class pizzaPlanet {
    private final Scanner scanner = new Scanner(System.in);
    private final menu menu = new menu();
    private final coupons coupons = new coupons();
    private boolean wantToQuit = false;

    public boolean getWantToQuit() {
        return wantToQuit;
    }


    private void navigation(int choice){
        switch(choice){
            case 1:
            {
                boolean isCorrect;
                do {
                    menu.drawMenu();
                    if(menu.getOrder()) break;
                    isCorrect = menu.checkOrder();
                    if(isCorrect) menu.saveOrder();
                } while(!isCorrect);
                break;
            }
            case 2:
            {
                boolean doneTakingCoupons;
                do {
                    coupons.drawCoupons();
                    if(coupons.pickCoupons()) break;
                    doneTakingCoupons = coupons.couponsReady();
                } while(doneTakingCoupons);
                coupons.saveCoupons();
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
                System.out.println("See you!");
                wantToQuit = true;
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
        System.out.println("2. Pick coupons");
        System.out.println("3. Apply for a work");
        System.out.println("4. Contact us");
        System.out.println("5. Quit\n");
        System.out.println("Choice: ");
        int choice = scanner.nextInt();
        //clear screen here
        navigation(choice);
    }
}
