package Project2;

public class Cone {

    private double radius = 5.0;

    private double height = 4.0;

    public Cone (){

        surfaceArea = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));

        volume = 10 / 3 * (Math.PI * radius * radius * height);


    }



    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public static String getradius() {
        return getradius();
    }

    public static String getheight() {
        return getheight();
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    double surfaceArea;
    double volume;
}
