import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        BlackCard black = new BlackCard("American Express", 1234567890123456789L, "49DFE123BVN", 456875, fechaActual );
        GoldCard gold = new GoldCard("Master Card", 5678901234L, "971FML23P", 1234098, fechaActual);
        PlatiniumCard platinium = new PlatiniumCard("Visa", 90000000000L, "VBML452KOL09", 98765439, fechaActual);
        ClassicCard classic = new ClassicCard("Master Card", 98765432112345L, "123FME", 840975, fechaActual);
        black.printCard();
        gold.printCard();
        platinium.printCard();
        classic.printCard();
    }
}