package templateMethod;
public class HummerH1Model extends templateMethod.HummerModel {

    @Override
    void start() {
        System.out.println("H1 start...");
    }

    @Override
    void stop() {
        System.out.println("H1 stop...");
    }

    @Override
    void alarm(){
        System.out.println("H1 alarm...");
    }

    @Override
    boolean gouzi() {
        return this.isAlarm;
    }

    @Override
    void engineBoom() {
        System.out.println("H1 engineBoom...");
    }

    @Override
    void setIsAlarm(boolean i) {

    }


}
