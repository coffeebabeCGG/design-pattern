package structuretype.adapter.newversion;

public class Adapter {

    public int convert(int volt) {
        int homeVolt = volt-215;
        return homeVolt;
    }
}
