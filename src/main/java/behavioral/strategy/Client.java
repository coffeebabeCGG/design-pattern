package behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        Duck redDuck = new RedDuck();
        Duck toyDuck = new ToyDuck();

        toyDuck.fly();
        redDuck.fly();
    }
}
