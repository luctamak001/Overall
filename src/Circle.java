public class Circle {

    private double radius;
    private double x;
    private double y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.x = 0.0;
        this.y = 0.0;
    }

    public Circle(double x, double y) {
        this.radius = 1;
        this.x = x;
        this.y = y;
    }

    public Circle() {
        this.radius = 1;
        this.x = 0.0;
        this.y = 0.0;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public static Circle makeCircleWithRadiusX(double radius, double x, double y) {
        return new Circle(radius, x, 0.0);
    }
}
