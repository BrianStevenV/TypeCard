import java.time.LocalDate;

public class CreditCard {
    private String issuer;
    private Long quota;

    private String numberCard;
    private int cvv;
    private LocalDate expirationDate;
    protected String issuerPrint;
    protected Long quotaPrint;
    protected String numCardPrint;
    protected int cvvPrint;
    protected LocalDate expirationPrint;

    public CreditCard(String issuer, Long quota, String numberCard, int cvv, LocalDate expirationDate) {
        this.issuer = issuer;
        this.quota = quota;
        this.numberCard = numberCard;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    public CreditCard(){}

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Long getQuota() {
        return quota;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void printCard(){
        String issuerPrint = getIssuer();
        Long quotaPrint = getQuota();
        String numCardPrint = getNumberCard();
        int cvvPrint = getCvv();
        LocalDate expirationPrint = getExpirationDate();
        System.out.println("The Issuer: " + issuerPrint + " with a quota: " + quotaPrint + " with number card: " + numCardPrint + " with a cvv: " + cvvPrint + " has a expiration date of: "  + expirationPrint);
    }
}
