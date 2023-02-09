/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import com.ifpe.tsproject.entidades.UserValidation;
import com.ifpe.tsproject.repositorio.UserRepo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ALUNO
 */
public class VerificationTest {
    
        @Test
    public void testVerificationOK() {
        UserValidation user = new UserValidation("andre@gmail.com", 81196546, true, 1011);
        UserRepo repo = new UserRepo();
        Boolean added = repo.addUserPhone(user);
        Boolean added2 = repo.addUserEmail(user);

        assertTrue(added);
        assertTrue(added2);

    }
    
    @Test
    public void testVerificationPhone() {
        UserValidation user = new UserValidation("andre@gmail.com", 81196546, true, 1011);
        UserRepo repo = new UserRepo();
        Boolean added = repo.addUserPhone(user);
        assertTrue(added);
    }

    @Test
    public void testVerificationEmail() {
        UserValidation user = new UserValidation("andre@gmail.com", 81196546, true, 1101);
        UserRepo repo = new UserRepo();
        Boolean added = repo.addUserEmail(user);
        assertTrue(added);
    }

    @Test
    public void InvalidCode() {
        UserValidation user = new UserValidation("andre@gmail.com", 81196546, true, 1111);
        UserRepo repo = new UserRepo();
        user.setconfirmationCode(0000);
        Boolean added = repo.addUserPhone(user);
        assertFalse(added);
    }

    @Test
    public void ExpiredLink() {
        UserValidation user = new UserValidation("andre@gmail.com", 81196546, true, 1111);
        UserRepo repo = new UserRepo();
        user.setIsActive(false);
        Boolean added = repo.addUserEmail(user);
        assertFalse(added);
    }

    @Test
    public void wrongNumber() {
        UserValidation user = new UserValidation("andre@gmail.com", 81196546, true, 1111);
        UserRepo repo = new UserRepo();
        user.setNumber(383648292);
        Boolean added = repo.addUserPhone(user);
        assertFalse(added);
    }
    
    
}
