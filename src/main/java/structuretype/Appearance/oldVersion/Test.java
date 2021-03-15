package structuretype.Appearance.oldVersion;

/**
 * @author cgg
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("working");
        Browser browser = new Browser();
        IDE ide = new IDE();
        WeChat weChat = new WeChat();

        browser.open();
        ide.open();
        weChat.open();

        System.out.println("off work");

        browser.close();
        ide.close();
        weChat.close();

    }
}
