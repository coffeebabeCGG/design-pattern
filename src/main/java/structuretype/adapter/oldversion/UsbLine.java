package structuretype.adapter.oldversion;

/**
 * usb
 */
public class UsbLine {

    /**
     * 只接受5V电压
     */
    public void charge(int volt) throws Exception {
        if (volt != 5) {
            throw new Exception("volt not support");
        }
        System.out.println("normal charge");

    }
}
