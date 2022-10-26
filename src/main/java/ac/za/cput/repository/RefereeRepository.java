package ac.za.cput.repository;

import ac.za.cput.domain.personal.Referee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefereeRepository extends JpaRepository<Referee, String> {
}