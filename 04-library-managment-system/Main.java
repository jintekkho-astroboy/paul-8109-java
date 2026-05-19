public class Main {
    public static void main(String[] args) {
        Book lordOfTheRings = new Book();
        System.out.println(lordOfTheRings);
        System.out.println(lordOfTheRings.getTitle());
        System.out.println(lordOfTheRings.getAuthor());
        System.out.println(lordOfTheRings.getNumberOfPages());

        Book b2 = new Book("Twilight", "Stephenie Meyer", 100);
        System.out.println(b2);
    }
}