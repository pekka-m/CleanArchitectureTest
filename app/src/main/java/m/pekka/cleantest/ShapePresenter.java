package m.pekka.cleantest;

/**
 * Created by Pekka Melgin on 22.10.2015.
 */
public class ShapePresenter {

    private CreateShape createShape;
    private Shape shape;

    public ShapePresenter() {
        createShape = new CreateShape();
    }

    public boolean createShape(double radius, String shape) {
        try {
            this.shape = createShape.createShape(radius, shape);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public double getArea() {
        //return calculateCircleArea.calculateCircleArea(radius).getArea();
        return this.shape.getArea();
    }

    public double getCircumference() {
        //return getCircumference.getCircumference(radius).getCircumference();
        return this.shape.getCircumference();
    }

    public double getVolume() {
        return this.shape.getVolume();
    }
}
