package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import softwaretest.entidades.User;
import softwaretest.repositorio.UserRepo;

public class VerificationTest {

    @Test
    public void testVerificationPhone() {
        User user = new User("Test@emial.com", 81196546, true, 1111);
        UserRepo repo = new UserRepo();
        Boolean added = repo.addUserPhone(user);
        assertTrue(added);

    }

    @Test
    public void testVerificationEmail() {
        User user = new User("Test@emial.com", 81196546, true, 1111);
        UserRepo repo = new UserRepo();
        Boolean added = repo.addUserEmail(user);
        assertTrue(added);
    }

    @Test
    public void InvalidCode() {
        User user = new User("Test@emial.com", 81196546, true, 1111);
        UserRepo repo = new UserRepo();
        user.setconfirmationCode(0000);
        Boolean added = repo.addUserPhone(user);
        assertFalse(added);
    }

    @Test
    public void ExpiredLink() {
        User user = new User("Test@emial.com", 81196546, true, 1111);
        UserRepo repo = new UserRepo();
        user.setIsActive(false);
        Boolean added = repo.addUserEmail(user);
        assertFalse(added);
    }

    @Test
    public void wrongNumber() {
        User user = new User("Test@emial.com", 81196546, true, 1111);
        UserRepo repo = new UserRepo();
        user.setNumber(384648292);
        Boolean added = repo.addUserPhone(user);
        assertFalse(added);
    }

}