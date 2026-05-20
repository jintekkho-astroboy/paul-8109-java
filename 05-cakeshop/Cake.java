import java.util.ArrayList;

public abstract class Cake {
    private String flavor;
    private ArrayList<String> ingredients = new ArrayList<String>();

    public Cake() {
        flavor = "N/A";
    }

    public Cake(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    // an abstract method has no implementation
    // if a parent class has an abstract method, the child class
    // MUST override it (the child class must have its own version)
    public abstract double calculateArea();
}