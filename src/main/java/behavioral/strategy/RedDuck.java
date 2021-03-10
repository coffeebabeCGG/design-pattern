package behavioral.strategy;

public class RedDuck extends Duck {

    public RedDuck(){
        super.fly = new FlyLight();
    }



}
