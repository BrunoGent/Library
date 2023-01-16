import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Author Camus = new Author("Albert Camus", "Albert@Camus.com", 'm');
        Book TheStranger = new Book("The Stranger", Camus, 9.99, 1);
        Author Author2 = new Author("x","",'x');
        Book Book2 = new Book("", Author2, 0,0);


        System.out.println(TheStranger);

        System.out.println("enter Author's name");
        Author2.setName(reader.next());
        System.out.println("enter Author's email");
        Author2.setEmail(reader.next());
        System.out.println("enter Author's gender");
        Author2.setGender(reader.next().charAt(0));

        System.out.println("enter book's name");
        Book2.setName(reader.next());
        System.out.println("enter book's price");
        Book2.setPrice(reader.nextDouble());
        System.out.println("enter book's stock");
        Book2.setQty(reader.nextInt());
        System.out.println(Book2);
    }
}
