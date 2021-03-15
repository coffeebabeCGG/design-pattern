package structuretype.Appearance.newVersion;


/**
 * 门面/外观
 */
public class Facade {

    public void open(Browser browser, IDE ide, WeChat weChat) {
        browser.open();
        ide.open();
        weChat.open();
    }

    public void close(Browser browser, IDE ide, WeChat weChat) {
        browser.close();
        ide.close();
        weChat.close();
    }

}
