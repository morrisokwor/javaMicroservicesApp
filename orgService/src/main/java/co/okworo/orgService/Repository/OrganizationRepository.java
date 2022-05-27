/**
 * 
 */
package co.okworo.orgService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.okworo.orgService.Entity.Organization;

/**
 * @author Morris.Okworo
 *
 */
public interface OrganizationRepository extends JpaRepository<Organization, Long>{

}
