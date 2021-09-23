package Project2;

public class Cylinder {

    private double height = 4.0;

    private double radius = 1.0;

    public Cylinder(){

        surfaceArea = 2 * Math.PI * radius * (radius + height);

        volume = Math.PI * radius * radius * height;

    }


    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public static String getheight() {
        return getheight();
    }

    public static String getradius() {
        return getradius();
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    double surfaceArea;
    double volume;

}
