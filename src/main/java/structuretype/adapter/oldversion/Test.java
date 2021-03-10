package structuretype.adapter.oldversion;

public class Test {
    public static void main(String[] args)throws Exception {
        HomeBattery homeBattery = new HomeBattery();

        int volt = homeBattery.supply();

        UsbLine usbLine = new UsbLine();

        usbLine.charge(volt);
    }

}
