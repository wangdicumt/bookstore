package cumt.service;

import cumt.domain.User;

public interface UserService {
	User login(String loginname,String password);
	public void register(User user);
	public void updatePassword(String password, int id);
}
