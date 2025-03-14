public class Circle {
    private double radius;
    private String color;

    // Constructor por defecto
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor con radio
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Constructor con radio y color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}