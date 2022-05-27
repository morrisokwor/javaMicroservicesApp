/**
 * 
 */
package co.okworo.orgService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Organization {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique=true)
	private String name;

	@Column(unique=true)
	private String code;

	private boolean isActive;

}
