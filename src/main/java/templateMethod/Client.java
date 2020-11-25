package templateMethod;

public class Client {


    public static void main(String[] args) {
        templateMethod.HummerModel hummerModel = new templateMethod.HummerH1Model();
        templateMethod.HummerModel hummerMode2 = new templateMethod.HummerH2Model();
        hummerMode2.setIsAlarm(false);
        hummerModel.run();
        hummerMode2.run();
    }


}
