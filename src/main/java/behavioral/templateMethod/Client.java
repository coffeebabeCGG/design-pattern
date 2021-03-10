package behavioral.templateMethod;

/**
 * 演示类
 *
 * @author cgg
 */
public class Client {

    /**
     * 模拟生产产品场景
     */
    public static void main(String[] args) {
        HummerModel hummerModel = new HummerH1Model();
        HummerModel hummerMode2 = new HummerH2Model();
        hummerMode2.setIsAlarm(false);
        hummerModel.run();
        hummerMode2.run();
    }


}
