package xavier.springsecurity.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xavier.springsecurity.entities.Role;
import xavier.springsecurity.entities.User;

import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
