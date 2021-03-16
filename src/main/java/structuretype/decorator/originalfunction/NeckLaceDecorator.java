package structuretype.decorator.originalfunction;

/**
 * @author cgg
 */
public class NeckLaceDecorator implements IBeauty {


    private IBeauty iBeauty;

    public NeckLaceDecorator(IBeauty iBeauty) {
        this.iBeauty = iBeauty;
    }

    @Override
    public int getBeautyValue() {
        return iBeauty.getBeautyValue() + 80;
    }
}
