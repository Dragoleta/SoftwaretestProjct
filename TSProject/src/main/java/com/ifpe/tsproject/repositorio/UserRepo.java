package com.ifpe.tsproject.repositorio;

import com.ifpe.tsproject.entidades.UserValidation;
import com.ifpe.tsproject.negocio.UsuarioNegocio;
import java.util.ArrayList;
import java.util.List;


public class UserRepo {

	private List<UserValidation> user;

	public UserRepo() {
		this.user = new ArrayList<>();
	}

	public boolean addUserPhone(UserValidation u) {
		Boolean result = UsuarioNegocio.verifyNumber(u.getconfirmationCode());

		if (u.getNumber() != 81196546) {
			return false;
		}
		if (result == false) {
			return false;
		}
		this.user.add(u);
		return true;
	}

	public boolean addUserEmail(UserValidation u) {
		Boolean result = UsuarioNegocio.verifyEmail(u.getconfirmationCode());
		if (result == false) {
			return false;
		}
                if ("andre@gmail.com".equals(u.getEmail())) {
                    return false;
                }
		if (u.getIsActive() == false) {
			return false;
		}
		this.user.add(u);
		System.out.println(u.getEmail());
		return true;
	}

}