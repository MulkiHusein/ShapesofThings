package Project2;

import java.util.Scanner;

import static java.lang.System.in;


public abstract class Shape implements ThreeDimensionalShape {

    public static void main(String[] args) {

    }


    public void shape() {


        Scanner scanner;
        scanner = new Scanner(in);



        System.out.println("Sphere" + Sphere.getRadius());
        System.out.println("Cube" + Cube.getwidth());
        System.out.println("Cylinder" + Cylinder.getheight() + Cylinder.getradius());
        System.out.println("Cone" + Cone.getradius() + Cone.getheight());





    }


}
