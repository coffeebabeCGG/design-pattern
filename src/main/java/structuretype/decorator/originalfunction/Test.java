package structuretype.decorator.originalfunction;

/**
 * @author cgg
 */
public class Test {


    public static void main(String[] args) {
        IBeauty me = new Me();
        System.out.println("unDecorator me is " + me.getBeautyValue());

        //一个装饰器类装饰
        IBeauty meWithRingDecorator = new RingDecorator(me);
        System.out.println("one decorator after , me is "+ meWithRingDecorator.getBeautyValue());

        //多次装饰器装饰
        IBeauty meWithManyDecorator = new RingDecorator(new EarringDecorator(new NeckLaceDecorator(me)));
        System.out.println("many decorator after , me is  "+ meWithManyDecorator.getBeautyValue());

        //任意装饰器装饰
        IBeauty meWithAnyDecorator = new RingDecorator(new NeckLaceDecorator(me));
        System.out.println("any decorator after , me is "+ meWithAnyDecorator.getBeautyValue());


    }
}
