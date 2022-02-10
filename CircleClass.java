class Circle {
    double x, y;
    double r;

    double circumference() {
        return 2 * Math.PI * r;
    }

    double area() {
        return Math.PI * r * r;
    }
}

class CircleObject {
    public static void main(String args[]) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.x = 0.0;
        c1.y = 0.0;
        c1.r = 5.0;

        c2.x = 0.0;
        c2.y = 0.0;
        c2.r = 3.0;

        System.out.println("Circumference : " + c1.circumference());
        System.out.println("Area : " + c1.area());

        System.out.println("Circumference : " + c2.circumference());
        System.out.print("Area : " + c2.area());
    }
}
