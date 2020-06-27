import factory.Pasta;
import factory.PastaFactory;

public class Main {
    public static void main(String[] args) {
        PastaFactory pastaFactory = new PastaFactory();
        Pasta pasta = pastaFactory.getPasta("Bolognese");
        System.out.println(pasta.getDetectedPasta());
    }
}

