package structuretype.decorator.originalfunction;

/**
 * @author cgg
 */
public class RingDecorator implements IBeauty {
    private IBeauty iBeauty;

    public RingDecorator(IBeauty iBeauty) {
        this.iBeauty = iBeauty;
    }

    @Override
    public int getBeautyValue() {
        return iBeauty.getBeautyValue() + 10;
    }
}
