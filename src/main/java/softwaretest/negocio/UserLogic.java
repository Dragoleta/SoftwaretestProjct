package softwaretest.negocio;

public class UserLogic {

    public static boolean verifyEmail(int i) {
        if (i == 1111) {
            return true;
        }
        return false;
    }

    public static boolean verifyNumber(int i) {
        if (i == 1111) {
            return true;
        }
        return false;
    }

    public boolean emailExpired() {
        return false;
    }

}