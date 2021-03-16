package structuretype.decorator.newfunction.one;

/**
 * @author cgg
 * @version 1.0
 * @date 2021/3/15
 */
public class HookHouseDecorator implements IHookHouse {
    private IHouse house;

    public HookHouseDecorator(IHouse house) {
        this.house = house;
    }

    @Override
    public void hangThings() {
        System.out.println("hang thing");
    }

    @Override
    public void live() {
        house.live();
    }
}
