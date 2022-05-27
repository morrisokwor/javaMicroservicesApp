/**
 * 
 */
package co.okworo.userService.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.okworo.userService.Dto.UserModel;
import co.okworo.userService.Service.UserService;
import lombok.RequiredArgsConstructor;

/**
 * @author Morris.Okworo
 *
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

	final UserService userService;

	@PostMapping
	public ResponseEntity<?> addUser(@RequestBody UserModel payload) {

		return ResponseEntity.ok(userService.createUser(payload));
	}

	@GetMapping
	public ResponseEntity<?> getAllUsers() {

		return ResponseEntity.ok(userService.getAllUsers());
	}

	@GetMapping("/{userId}")
	public ResponseEntity<?> getUserWithOrganization(@PathVariable("userId") Long userId) {

		return ResponseEntity.ok(userService.getUserWithOrganization(userId));
	}

}
