import java.io.File;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        ChairFactory factory = new ChairFactory();

        VictorianChair chair1 = factory.createVictorianChair();
        MagicChair chair2 = factory.createMagicChair();
        FunctionalChair chair3 = factory.createFunctionalChair();
        client.setChair(chair1);
        client.sit();

        client.setChair(chair2);
        client.sit();

        client.setChair(chair3);
        client.sit();


    }
}
