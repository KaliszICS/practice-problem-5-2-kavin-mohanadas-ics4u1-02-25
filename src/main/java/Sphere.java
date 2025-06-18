public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double area() {
        double r = getRadius();
        return 4 * Math.PI * r * r;
    }

    public double volume() {
        double r = getRadius();
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}