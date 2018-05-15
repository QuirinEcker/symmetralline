import processing.core.PApplet;

public class Ecker_SymmetralLine extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Ecker_SymmetralLine");
    }

    public void settings() {
        size(500,500);
    }

    public void setup() {
        frameRate(60);
        background(250);
    }

    public void draw() {
        int distanceFromX;
        int distanceFromY;
        distanceFromX = calculateX();
        distanceFromY = calculateY();

        background(250);
        blackLine(250, 250, mouseX, mouseY);
        blackLine(250,250, distanceFromX, distanceFromY);
    }

    private int calculateY() {
        int x = height / 2;
        int a = mouseY;

        int distanceFromCenter = a - x;
        int distanceFromCenterNeg = x - distanceFromCenter;

        return distanceFromCenterNeg;
    }

    private int calculateX() {
        int x = width / 2;
        int a = mouseX;

        int distanceFromCenter = a - x;
        int distanceFromCenterNeg = x - distanceFromCenter;

        return distanceFromCenterNeg;
    }

    private void blackLine(int firstX, int firstY, int secondX, int secondY) {
        stroke(0);
        fill(0);
        line(firstX, firstY, secondX, secondY);
    }
}
