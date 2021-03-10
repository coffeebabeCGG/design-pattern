package behavioral.strategy;

abstract class Duck {

    /**
     * 需要经常变化得行为，使用组合+接口关系 来达到复用
     */
    protected Fly fly;


    void swimming(){
        System.out.println("i am  swimming");
    }

    void eat(){
        System.out.println("i am eating");
    }

    void fly() {
        this.fly.flying();
    }
}
