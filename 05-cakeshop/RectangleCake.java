public class RectangleCake extends Cake{
  private double length;
  private double width;

    public RectangleCake() {
        super();
    }

    public RectangleCake(String flavor, double length, double width) {
        super(flavor);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double calculateArea() {
        return width * length;
    }
}