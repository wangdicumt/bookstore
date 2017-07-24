package cumt.serviceImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cumt.domain.User;
import cumt.mapper.UserMapper;
import cumt.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public User login(String loginname, String password) {
		return userMapper.find(loginname, password);
	}


	@Override
	public void register(User user) {
		userMapper.saveUser(user);
	}


	@Override
	public void updatePassword(String password, int id) {
		userMapper.changePassword(password, id);
	}

}
