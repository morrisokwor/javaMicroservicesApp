/**
 * 
 */
package co.okworo.userService.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Morris.Okworo
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String username;
	
	@Email
	private String email;
	
	private String password;
	
	private LocalDate dateOfBirth;
	
	

}
