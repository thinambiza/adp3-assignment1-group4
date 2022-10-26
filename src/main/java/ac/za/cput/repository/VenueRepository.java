/**
 * Venue Repository
 * VenueRepository.java
 * Author: Thina Mbiza 217217095
 * Date 22 October 2022
 */

package ac.za.cput.repository;

import ac.za.cput.domain.game.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VenueRepository extends JpaRepository<Venue, String> {
}
