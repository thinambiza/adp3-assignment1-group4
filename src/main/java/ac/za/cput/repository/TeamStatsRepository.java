package ac.za.cput.repository;

import ac.za.cput.domain.info.TeamStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TeamStatsRepository extends JpaRepository<TeamStats, String> {
    Set<TeamStats> findByTeamId(String teamId);
    TeamStats getTeamStatsByTeamIdAndTournamentId(String teamId, String tournamentId);
}