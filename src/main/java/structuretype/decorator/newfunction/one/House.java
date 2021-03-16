package structuretype.decorator.newfunction.one;

/**
 * @author cgg
 * @version 1.0
 * @date 2021/3/15
 */
public class House implements IHouse {
    @Override
    public void live() {
        System.out.println("house has live");
    }
}
