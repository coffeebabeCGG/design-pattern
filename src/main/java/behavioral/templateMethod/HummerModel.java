package behavioral.templateMethod;

/**
 * 产品抽象类
 *
 * @author cgg
 *
 */
abstract class HummerModel {

    boolean isAlarm = true;

    /**
     * 基本方法
     */
    abstract void start();

    /**
     * 基本方法
     */
    abstract void stop();

    /**
     * 基本方法
     */
    abstract void alarm();

    /**
     * 钩子函数，通过此函数反应子类的特殊行为
     */
    abstract boolean gouzi();

    /**
     * 基本方法
     */
    abstract void engineBoom();

    /**
     * 配合钩子函数体现子类的行为
     */
    abstract void setIsAlarm(boolean i);

    /**
     * 模板方法
     */
    void run() {
        this.engineBoom();
        if (gouzi()) {
            this.alarm();
        }
        this.start();
        this.stop();
    }


}
