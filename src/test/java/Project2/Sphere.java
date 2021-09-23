package Project2;

public class Sphere {

    private static double radius = 2.0;



    public Sphere() {

        surfaceArea = 4 * Math.PI * radius ;

        volume  = (4.0 / 3) * Math.PI * radius * radius * radius;


    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }
    public double getradius(){
        return radius;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    double surfaceArea;
    double volume;
}
