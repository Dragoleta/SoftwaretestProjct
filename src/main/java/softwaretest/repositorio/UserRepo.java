package softwaretest.repositorio;

import java.util.ArrayList;
import java.util.List;

import softwaretest.entidades.User;
import softwaretest.negocio.UserLogic;

public class UserRepo {

	private List<User> user;

	public UserRepo() {
		this.user = new ArrayList<User>();
	}

	public boolean addUserPhone(User u) {
		Boolean result = UserLogic.verifyNumber(u.getconfirmationCode());

		if (u.getNumber() != 81196546) {
			return false;
		}
		if (result == false) {
			return false;
		}
		this.user.add(u);
		return true;
	}

	public boolean addUserEmail(User u) {
		Boolean result = UserLogic.verifyEmail(u.getconfirmationCode());
		if (result == false) {
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