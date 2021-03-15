import pizzaPlanet.pizzaPlanet;

public class main {
    public static void main(String[] args) {
        pizzaPlanet restaurant = new pizzaPlanet();
        while(!restaurant.getWantToQuit()) {
            restaurant.welcome();
        }
    }
}
