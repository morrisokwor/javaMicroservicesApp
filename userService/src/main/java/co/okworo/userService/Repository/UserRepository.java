/**
 * 
 */
package co.okworo.userService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.okworo.userService.Entity.User;

/**
 * @author Morris.Okworo
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{

}
