package securityexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import securityexample.model.User;
import securityexample.service.UserService;

@SpringBootApplication
public class SecurityMongodbApplication implements CommandLineRunner{

	@Autowired
	UserService service;
	
    public static void main(String[] args) {
        SpringApplication.run(SecurityMongodbApplication.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		service.deleteAll();
		User user = new User("demo", "demo", "ADMIN");
		service.save(user);
	}
    
}
