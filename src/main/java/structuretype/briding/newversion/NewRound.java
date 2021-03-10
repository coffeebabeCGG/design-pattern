package structuretype.briding.newversion;

public class NewRound {

    private IColor iColor;

    public void setiColor(IColor iColor) {
        this.iColor = iColor;
    }
    public void draw() {
        System.out.println(this.iColor.getColor() + " draw Round ");
    }
}
