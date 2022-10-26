/**
 * Player Repository
 * PlayerRepository.java
 * Author: Thina Mbiza 217217095
 * Date 22 October 2022
 */

package ac.za.cput.repository;

import ac.za.cput.domain.personal.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
}
