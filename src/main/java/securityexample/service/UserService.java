package securityexample.service;

import securityexample.model.User;

public interface UserService {
	public User findByUsername(String username);
	public void save(User user);
	public void deleteAll();
}
