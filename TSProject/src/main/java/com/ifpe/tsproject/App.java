package com.ifpe.tsproject;

import com.ifpe.tsproject.entidades.UserValidation;
import com.ifpe.tsproject.repositorio.UserRepo;

public class App {
    public static void main(String[] args) {
        UserRepo repo = new UserRepo();
        UserValidation user = new UserValidation("Test@emial.com", 81196546, true, 1111);

        Boolean added = repo.addUserEmail(user);

    }
}
