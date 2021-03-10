package structuretype.briding.newversion;

public class Test {


    public static void main(String[] args) {
        NewRectangle newRectangle = new NewRectangle();
        newRectangle.setiColor(new Red());
        newRectangle.draw();

        NewRound newRound = new NewRound();
        newRound.setiColor(new Yellow());
        newRound.draw();

        NewTriangle newTriangle = new NewTriangle();
        newTriangle.setiColor(new Bule());
        newRectangle.draw();


    }
}
