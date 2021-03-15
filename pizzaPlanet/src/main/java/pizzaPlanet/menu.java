package pizzaPlanet;

import java.util.Scanner;

public class menu{
    private String[] menu = new String[]{"Margarita", "Salami", "Capriciosa", "Hawai"};
    private String[] doughType = new String[]{"Thick", "Thin"};
    private String[] sauceType = new String[]{"Garlic", "Ketchup"};
    private final Scanner scan = new Scanner(System.in);
    private int pizzaChoice = 0;
    private int doughChoice = 0;
    private int sauceChoice = 0;

    public void drawMenu() {
        System.out.println("------AVAILABLE PRODUCTS------");
        for(int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }
        System.out.println(menu.length + 1 + ". Go back");
        System.out.println("Choice: ");

        pizzaChoice = scan.nextInt();

        System.out.println("------PICK YOUR DOUGH------");
        for(int i = 0; i < doughType.length; i++) {
            System.out.println(i + 1 + ". " + doughType[i]);
        }
        System.out.println("Choice: ");

        doughChoice = scan.nextInt();

        System.out.println("------PICK YOUR SAUCE------");
        for(int i = 0; i < sauceType.length; i++) {
            System.out.println(i + 1 + ". " + sauceType[i]);
        }
        System.out.println("Choice: ");

        sauceChoice = scan.nextInt();
    }

    public void getOrder() {
        System.out.println("Final order: " + menu[pizzaChoice-1] + " on " + doughType[doughChoice-1].toLowerCase() + " dough with " + sauceType[sauceChoice-1].toLowerCase());
    }

}
