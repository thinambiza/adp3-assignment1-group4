package ac.za.cput.repository;

import ac.za.cput.domain.info.GameStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameStatsRepository extends JpaRepository<GameStats, String> {
    GameStats findGameStatsByFixtureIdAndTeamId(String fixtureId, String teamId);
}