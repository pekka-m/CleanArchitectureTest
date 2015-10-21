package m.pekka.cleantest;

/**
 * Created by Pekka Melgin on 22.10.2015.
 */
/**
 * Created by Pekka Melgin on 21.10.2015.
 */
public class Ball implements Shape {

    private double radius;
    private double volume;
    private double area;

    public Ball(double radius) {
        this.radius = radius;
        this.volume = 4 * Math.PI * Math.pow(this.radius, 3) / 3;
        this.area = 4 * Math.PI * Math.pow(this.radius, 2);
    }

    public double getArea() {
        return this.area;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getCircumference(){
        return -1;
    }
}
