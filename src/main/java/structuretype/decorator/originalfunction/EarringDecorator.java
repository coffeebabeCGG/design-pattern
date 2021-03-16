package structuretype.decorator.originalfunction;

public class EarringDecorator implements IBeauty {
    private IBeauty iBeauty;

    public EarringDecorator(IBeauty iBeauty) {
        this.iBeauty = iBeauty;
    }

    @Override
    public int getBeautyValue() {
        return iBeauty.getBeautyValue() + 50;
    }
}
