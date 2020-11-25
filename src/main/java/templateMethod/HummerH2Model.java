package templateMethod;

/**
 * H2产品
 *
 * @author cgg
 */
public class HummerH2Model extends templateMethod.HummerModel {

    @Override
    void start() {
        System.out.println("H2 start...");
    }

    @Override
    void stop() {
        System.out.println("H2 stop...");
    }

    @Override
    void alarm(){
       System.out.println("H2 alarm...");
    }

    @Override
    boolean gouzi() {
        return this.isAlarm;
    }

    @Override
    public void setIsAlarm(boolean i) {
        this.isAlarm = i;
    }

    @Override
    void engineBoom() {
        System.out.println("H2 engineBoom...");
    }


}
