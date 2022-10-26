package ac.za.cput.security.repository;

import ac.za.cput.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User getUserByEmail(String email);
}