package softwaretest.entidades;

public class Card {

    private String ownerName;
    private long CardCvv;
    private long UserCPF;
    private long CardNumber;
    private String ExpirationDate;
    private String cardType;

    public Card(int CardCvv, String cardType, long CardNumber, String ownerName, long UserCPF, String ExpirationDate) {
        this.CardCvv = CardCvv;
        this.ownerName = ownerName;
        this.UserCPF = UserCPF;
        this.CardNumber = CardNumber;
        this.ExpirationDate = ExpirationDate;
        this.cardType = cardType;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getCardCvv() {
        return this.CardCvv;
    }

    public void setCardCvv(long CardCvv) {
        this.CardCvv = CardCvv;
    }

    public long getUserCPF() {
        return this.UserCPF;
    }

    public void setUserCPF(long UserCPF) {
        this.UserCPF = UserCPF;
    }

    public long getCardNumber() {
        return this.CardNumber;
    }

    public void setCardNumber(long CardNumber) {
        this.CardNumber = CardNumber;
    }

    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

}