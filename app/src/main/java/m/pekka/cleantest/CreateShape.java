package m.pekka.cleantest;

/**
 * Created by Pekka Melgin on 22.10.2015.
 */
public class CreateShape {

    public Shape createShape(double radius, String shape) {
        switch (shape) {
            case "circle":
                return new Circle(radius);
            case "ball":
                return new Ball(radius);
            default:
                return null;
        }
    }

}
