public class Main {
    public static void main(String[] args) {
        Point point = new Point(5,5);
        System.out.println(point);
        MovAblePoint movablePoint = new MovAblePoint(point.getX(), point.getY(), 10,20);
        System.out.println("Trước khi move" + movablePoint);
        movablePoint.move();
        System.out.println("sau khi move" + movablePoint);

    }
}