/**
 * 
 */
package co.okworo.userService.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.okworo.userService.Dto.Organization;
import co.okworo.userService.Dto.UserModel;
import co.okworo.userService.Dto.UserOrganization;
import co.okworo.userService.Entity.User;
import co.okworo.userService.Repository.UserRepository;
import lombok.RequiredArgsConstructor;

/**
 * @author Morris.Okworo
 *
 */
@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	private final RestTemplate restTemplate;

	public User createUser(UserModel payload) {

		User user = new User();
		user.setDateOfBirth(payload.getDateOfBirth());
		user.setEmail(payload.getEmail());
		user.setFirstName(payload.getFirstName());
		user.setLastName(payload.getLastName());
		user.setUsername(payload.getUsername());

		return userRepository.save(user);

	}

	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public UserOrganization getUserWithOrganization(Long userId) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).get();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+user.getOrganizationId());

		Organization organization = restTemplate.getForObject("http://ORGANIZATION-SERVICE/org/"+user.getOrganizationId(),Organization.class);

		UserOrganization userOrganization = new UserOrganization();
		userOrganization.setUser(new UserModel(user.getId(), user.getFirstName(), user.getLastName(),
				user.getUsername(), user.getEmail(), user.getDateOfBirth(), user.getOrganizationId()));
		userOrganization.setOrganization(organization);

		return userOrganization;
	}

}
