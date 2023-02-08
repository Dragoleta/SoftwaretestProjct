package softwaretest;

import softwaretest.entidades.User;
import softwaretest.repositorio.UserRepo;

public class App {
    public static void main(String[] args) {
        UserRepo repo = new UserRepo();
        User user = new User("Test@emial.com", 81196546, true, 1111);

        Boolean added = repo.addUserEmail(user);

    }
}
