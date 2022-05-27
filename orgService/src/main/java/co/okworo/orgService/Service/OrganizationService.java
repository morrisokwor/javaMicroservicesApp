/**
 * 
 */
package co.okworo.orgService.Service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import co.okworo.orgService.Dto.OrganizationModel;
import co.okworo.orgService.Entity.Organization;
import co.okworo.orgService.Repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;

/**
 * @author Morris.Okworo
 *
 */
@Service
@RequiredArgsConstructor
public class OrganizationService {

	private final OrganizationRepository organizationRepository;

	public Organization createOrganization(OrganizationModel payload) {

		Organization organization = new Organization();
		organization.setActive(payload.isActive());
		organization.setCode(payload.getCode());
		organization.setName(payload.getName());

		return organizationRepository.save(organization);
	}

	public Iterable<Organization> findAll() {
		// TODO Auto-generated method stub
		return organizationRepository.findAll();
	}

	public Organization findById(Long orgId) {
		// TODO Auto-generated method stub

		Organization org = Optional.ofNullable(organizationRepository.findById(orgId).get()).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, orgId + " Organization do not exist"));

		return org;
	}

}
