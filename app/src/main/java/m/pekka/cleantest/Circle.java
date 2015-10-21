package m.pekka.cleantest;

/**
 * Created by Pekka Melgin on 21.10.2015.
 */
public class Circle implements Shape {

    private double radius;
    private double circumference;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.circumference = 2 * Math.PI * this.radius;
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getVolume() {
        return -1;
    }
}
