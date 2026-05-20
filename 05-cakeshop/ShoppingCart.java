import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Cake> cart = new ArrayList<>();

    public void addToCart(Cake newCake) {
        cart.add(newCake);
    }

    public double calculateTotal() {
        double total = 0;
        for (Cake cake : cart) {
           total = total +  cake.calculateArea();
        }
        return total;
    }
}