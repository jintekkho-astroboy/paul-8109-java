public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        var circleCake = new CircleCake(20, "cheese");
        cart.addToCart(circleCake);

        var rectangleCake = new RectangleCake("chocolate", 30, 20);
        cart.addToCart(rectangleCake);

        var total = cart.calculateTotal();
        System.out.println("The total area is " + total + "cm square");
    }
}