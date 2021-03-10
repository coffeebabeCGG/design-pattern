package structuretype.briding.newversion;

public class NewTriangle {

    private IColor iColor;

    public void setiColor(IColor iColor) {
        this.iColor = iColor;
    }

    public void draw() {
        System.out.println(this.iColor.getColor() + " draw Triangle ");
    }
}
