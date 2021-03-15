package structuretype.Appearance.newVersion;

/**
 * @author cgg
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("working");
        Browser browser = new Browser();
        IDE ide = new IDE();
        WeChat weChat = new WeChat();
        Facade facade = new Facade();

        facade.open(browser, ide, weChat);

        System.out.println("off work");

        facade.close(browser, ide, weChat);

    }
}
