/**
 RefereeRepository.java
 Repository for Referee
 Author: Zuko Fukula (217299911)
 Date: 17 October 2022
 */

package ac.za.cput.repository;

import ac.za.cput.domain.personal.Referee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefereeRepository extends JpaRepository<Referee, String> {
}
