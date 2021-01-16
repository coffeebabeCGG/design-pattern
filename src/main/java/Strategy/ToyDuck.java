package Strategy;

public class ToyDuck extends Duck {

    public ToyDuck() {
        super.fly = new FlySlow();
    }
}
