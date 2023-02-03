import java.time.LocalDate;

public class PlatiniumCard extends CreditCard{
    protected String issuerPrint;
    protected Long quotaPrint;
    protected String numCardPrint;
    protected int cvvPrint;
    protected LocalDate expirationPrint;
    public PlatiniumCard(String issuer, Long quota, String numberCard, int cvv, LocalDate expirationDate){
        super(issuer, quota, numberCard, cvv, expirationDate);
    }

    @Override
    public void printCard(){
        issuerPrint = this.getIssuer();
        quotaPrint = this.getQuota();
        numCardPrint = this.getNumberCard();
        cvvPrint = this.getCvv();
        expirationPrint = this.getExpirationDate();
        System.out.println("The Issuer: " + issuerPrint + " with a quota: " + quotaPrint + " with number card: " + numCardPrint + " with a cvv: " + cvvPrint + " has a expiration date of: "  + expirationPrint);

    }
}
