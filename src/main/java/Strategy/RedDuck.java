package Strategy;

public class RedDuck extends Duck {

    public RedDuck(){
        super.fly = new FlyLight();
    }



}
