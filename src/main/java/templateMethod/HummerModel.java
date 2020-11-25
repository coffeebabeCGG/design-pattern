package templateMethod;
/**
 * @author cgg
 */
public abstract class HummerModel {

    boolean isAlarm = true;

    //基本方法
    abstract void start();

    //基本方法
    abstract void stop();

    //基本方法
    abstract void alarm();

    abstract boolean gouzi();

    //基本方法
    abstract void engineBoom();

    abstract void setIsAlarm(boolean i);

    //模板方法
    void run(){
        this.engineBoom();

        if (gouzi()) {
            this.alarm();
        }
        this.start();
        this.stop();
    };


}
