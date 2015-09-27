package securityexample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import securityexample.model.User;
import securityexample.model.UserSecurity;
import securityexample.service.UserService;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private final UserService userService;
	
	@Autowired
	public CustomUserDetailsService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserSecurity loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User user = userService.findByUsername(username);
		return new UserSecurity(user);
	}

}
