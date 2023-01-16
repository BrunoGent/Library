public class Library {
    public static void main(String[] args) {
    Author Camus = new Author("Albert Camus", "Albert@Camus.com", 'm');
    Book TheStranger = new Book("The Stranger", Camus, 9.99, 1);

        System.out.println(TheStranger);

    }
}
