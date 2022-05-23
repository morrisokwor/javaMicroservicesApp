/**
 * 
 */
package co.okworo.userService.Service;

import org.springframework.beans.factory.annotation.Autowired;

import co.okworo.userService.Entity.User;
import co.okworo.userService.Payload.UserModel;
import co.okworo.userService.Repository.UserRepository;

/**
 * @author Morris.Okworo
 *
 */
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User createUser(UserModel userModel) {
		
		User user = new User();
		user.setDateOfBirth(userModel.getDateOfBirth());
		user.setEmail(userModel.getEmail());
		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setUsername(userModel.getUsername());
		
		
		return userRepository.save(user);
		
	}

}
