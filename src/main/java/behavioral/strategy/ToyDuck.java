package behavioral.strategy;

public class ToyDuck extends Duck {

    public ToyDuck() {
        super.fly = new FlySlow();
    }
}
