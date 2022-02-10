class Point {
    int x, y;

    Point(int a, int b) {
        x = a;
        y = b;
    }
}

class InitObject {
    public static void main(String args[]) {
        Point p = new Point(4, 7);

        System.out.println(p.x);
        System.out.print(p.y);
    }
}
