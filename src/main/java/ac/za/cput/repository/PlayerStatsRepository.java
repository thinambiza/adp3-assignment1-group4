package ac.za.cput.repository;

import ac.za.cput.domain.info.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PlayerStatsRepository extends JpaRepository<PlayerStats, String> {
    Set<PlayerStats> getPlayerStatsByFixtureIdAndTeamId(String fixtureId, String teamId);
}