public class CircleCake extends Cake {
    private double radius;

    public CircleCake() {
        super();
    }

    public CircleCake(double radius, String flavor) {
        super(flavor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }

    }

    @Override
    public double calculateArea() {
       return 22/7 * (radius * radius);
    }


}
