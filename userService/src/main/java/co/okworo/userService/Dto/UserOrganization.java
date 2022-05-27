/**
 * 
 */
package co.okworo.userService.Dto;

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
public class UserOrganization {
	
	private UserModel user;
	
	private Organization organization;	
	

}
