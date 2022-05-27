/**
 * 
 */
package co.okworo.orgService.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.okworo.orgService.Dto.OrganizationModel;
import co.okworo.orgService.Service.OrganizationService;
import lombok.RequiredArgsConstructor;

/**
 * @author Morris.Okworo
 *
 */
@RestController
@RequestMapping("/org")
@RequiredArgsConstructor
public class OrganizationController {

	private final OrganizationService organizationService;

	@PostMapping
	public ResponseEntity<?> addOrganization(@RequestBody OrganizationModel payload) {

		return ResponseEntity.ok(organizationService.createOrganization(payload));
	}
	
	@GetMapping
	public ResponseEntity<?> getAllOrganizations() {

		return ResponseEntity.ok(organizationService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> fingOrganizationById(@PathVariable("id") Long orgId) {

		return ResponseEntity.ok(organizationService.findById(orgId));
	}

}
