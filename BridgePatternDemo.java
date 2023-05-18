package bridge_java;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
        Shape GreenCircle = new Circle(new GreenCircle(), 100, 100, 10);

        redCircle.draw();
        GreenCircle.draw();
    }
}
