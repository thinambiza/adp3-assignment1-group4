package ac.za.cput.repository;

import ac.za.cput.domain.game.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FixtureRepository extends JpaRepository<Fixture, String> {
}