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
public class Organization {

	private Long id;

	private String name;

	private String code;

	private boolean isActive;
}
