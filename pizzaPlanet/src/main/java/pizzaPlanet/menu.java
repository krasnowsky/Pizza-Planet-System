package pizzaPlanet;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class menu{
    private final String[] menu = new String[]{"Margarita", "Salami", "Capriciosa", "Hawai"};
    private final String[] doughType = new String[]{"Thick", "Thin"};
    private final String[] sauceType = new String[]{"Garlic", "Ketchup"};
    private final Scanner scan = new Scanner(System.in);
    private String order;
    private int orderId = 1;
    StringBuilder strBuilder = new StringBuilder();

    public void drawMenu() {
        System.out.println("------AVAILABLE PRODUCTS------");
        for(int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }
        System.out.println(menu.length + 1 + ". Go back");
        System.out.println("Choice: ");
    }

    public boolean getOrder() {
        int pizzaChoice = scan.nextInt();

        if(pizzaChoice == menu.length + 1) return true;

        System.out.println("------PICK YOUR DOUGH------");
        for(int i = 0; i < doughType.length; i++) {
            System.out.println(i + 1 + ". " + doughType[i]);
        }
        System.out.println("Choice: ");

        int doughChoice = scan.nextInt();

        System.out.println("------PICK YOUR SAUCE------");
        for(int i = 0; i < sauceType.length; i++) {
            System.out.println(i + 1 + ". " + sauceType[i]);
        }
        System.out.println("Choice: ");

        int sauceChoice = scan.nextInt();
        System.out.println("Final order: " + menu[pizzaChoice -1] + " on " + doughType[doughChoice -1].toLowerCase() + " dough with " + sauceType[sauceChoice -1].toLowerCase());
        order = menu[pizzaChoice -1] + " on " + doughType[doughChoice -1].toLowerCase() + " dough with " + sauceType[sauceChoice -1].toLowerCase();
        return false;
    }

    public boolean checkOrder() {
        System.out.println("Is you order correct? [Y/N]");
        String correct = scan.next();

        if(correct.equals("y")){
            System.out.println("Thank you for your order!");

            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            Date date = new Date();
            strBuilder.append("#" + orderId + " " + order + " [" + formatter.format(date) + "]\n");
            return true;
        }
        else {
            System.out.println("Please place Your order once more :)");
            return false;
        }
    }

    public void saveOrder() {
        try(PrintWriter out = new PrintWriter("orders.txt")) {
            out.println(strBuilder.toString());
            orderId++;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
