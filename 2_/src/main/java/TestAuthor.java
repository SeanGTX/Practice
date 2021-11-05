import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author("john", "lol@m.com", 'M');
        System.out.println(author);

        author.setEmail("noEmail@gmail.com");

        System.out.println(author.toString());

    }
}
