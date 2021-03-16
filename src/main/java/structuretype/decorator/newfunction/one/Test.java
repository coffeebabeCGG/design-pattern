package structuretype.decorator.newfunction.one;

/**
 * @author cgg
 * @version 1.0
 * @date 2021/3/15
 */
public class Test {

    public static void main(String[] args) {
        //未装饰前房子类的功能
        IHouse house = new House();
        house.live();

        //装饰后的房间类
        //半透明模式，调用者必须知道IHookHouse 接口，才可以使用
        IHookHouse newHouse = new HookHouseDecorator(house);
        newHouse.live();
        newHouse.hangThings();
    }

}
