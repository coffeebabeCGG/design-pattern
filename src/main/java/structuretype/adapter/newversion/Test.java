package structuretype.adapter.newversion;

import structuretype.adapter.oldversion.HomeBattery;
import structuretype.adapter.oldversion.UsbLine;

public class Test {

    public static void main(String[] args)throws Exception {
        HomeBattery homeBattery = new HomeBattery();

        int homeVolt = homeBattery.supply();

        UsbLine usbLine = new UsbLine();

        Adapter adapter = new Adapter();

        usbLine.charge(adapter.convert(homeVolt));
    }






}
