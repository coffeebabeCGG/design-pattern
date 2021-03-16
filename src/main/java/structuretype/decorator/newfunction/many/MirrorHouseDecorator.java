package structuretype.decorator.newfunction.many;

import structuretype.decorator.newfunction.one.IHouse;

/**
 * @author cgg
 * @version 1.0
 * @date 2021/3/15
 */
public class MirrorHouseDecorator implements IMirrorHouse {

    private IHouse iHouse;

    public MirrorHouseDecorator(IHouse iHouse) {
        this.iHouse = iHouse;
    }

    @Override
    public void lookMirror() {
        System.out.println("look mirror");
    }

    @Override
    public void live() {
        iHouse.live();
    }
}
