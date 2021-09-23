package Project2;

public class Cube {



    private double width = 5.0 ;

    public Cube(){


        surfaceArea = 6 * width * width;

        volume = width*width*width;
    }


    public Cube(Object volume, double width) {

        this.width = width;
        surfaceArea = 6 * this.width * this.width;
    }

    public static String getwidth() {
        return getwidth();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }








    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("width=").append(width);
        sb.append('}');
        return sb.toString();
    }


    double surfaceArea;
    double volume;



}


