package softwaretest.entidades;

public class User {
    private String Email;
    private Long Number;
    private boolean IsActive;
    private int confirmationCode;

    public User(String Email, long Number, boolean IsActive, int confirmationCode) {
        this.Email = Email;
        this.Number = Number;
        this.IsActive = IsActive;
        this.confirmationCode = confirmationCode;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Long getNumber() {
        return this.Number;
    }

    public void setNumber(long Number) {
        this.Number = Number;
    }

    public boolean isIsActive() {
        return this.IsActive;
    }

    public boolean getIsActive() {
        return this.IsActive;
    }

    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    public int getconfirmationCode() {
        return this.confirmationCode;
    }

    public void setconfirmationCode(int confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

}