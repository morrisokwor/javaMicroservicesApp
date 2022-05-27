/**
 * 
 */
package co.okworo.userService.Dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;

import co.okworo.userService.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Morris.Okworo
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

	private Long id;

	private String firstName;

	private String lastName;

	private String username;

	@Email
	private String email;

	private LocalDate dateOfBirth;
	
	private long organizationId;

}
