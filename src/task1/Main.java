package task1;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(23, 45);
        Point point2 = new Point(-8, 5);
        System.out.println("Start values point1: " + point1);
        System.out.println("Start values point2: " + point2);
        point1.flip();
        point2.flip();
        System.out.println("Mirror values point1: " + point1);
        System.out.println("Mirror values point2: " + point2);
        double distance = point1.distance(point2);
        System.out.println("Distance value: " + distance);

    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int change = -x;
        x = -y;
        y = change;
    }

    public double distance(Point point) {
        int x1 = point.x - x;
        int y1 = point.y - y;
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
    }
    @Override
    public String toString() {
        return "(" + x + ", "+ y +")";
    }
}