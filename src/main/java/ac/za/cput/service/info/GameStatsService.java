/**
 * Tournament.java
 * Game Stats Service
 * Author: Melisa Bhixa 217131085
 * Date: 17 October 2022
 */

package ac.za.cput.service.info;

import ac.za.cput.domain.info.GameStats;
import ac.za.cput.domain.info.PlayerStats;
import ac.za.cput.domain.info.TeamStats;
import ac.za.cput.domain.personal.Player;
import ac.za.cput.repository.GameStatsRepository;
import ac.za.cput.repository.PlayerRepository;
import ac.za.cput.repository.PlayerStatsRepository;
import ac.za.cput.repository.TeamStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameStatsService {

    @Autowired
    private GameStatsRepository repository;

    @Autowired
    private TeamStatsRepository teamStatsRepository;
    @Autowired
    private PlayerStatsRepository playerStatsRepository;
    @Autowired
    private PlayerRepository playerRepository;

    public GameStats save(GameStats gameStats){
        return repository.save(gameStats);
    }

    public GameStats getGameStatByFixtureIdAndTeamId(String fixtureId, String teamId){
        return repository.findGameStatsByFixtureIdAndTeamId(fixtureId, teamId);
    }

    public void teamScoredUpdate(String tournamentId, String fixtureId, String teamId, String playerId){
        GameStats gameStats = repository.findGameStatsByFixtureIdAndTeamId(fixtureId, teamId);
        PlayerStats playerStats = playerStatsRepository.getPlayerStatsByFixtureIdAndPlayerId(fixtureId, playerId);
        TeamStats teamStats = teamStatsRepository.getTeamStatsByTeamIdAndTournamentId(teamId, tournamentId);
        Player player = playerRepository.findById(playerId).get();

        int currentGameGoal = gameStats.getGoalsScored();
        int inGamePlayerGoals = playerStats.getGoalsScored();
        int teamGoalsFor = teamStats.getGoalsFor();
        int playerGoals = player.getTotalGoalsScored();

        currentGameGoal++;
        inGamePlayerGoals++;
        teamGoalsFor++;
        playerGoals++;

        gameStats.setGoalsScored(currentGameGoal);
        playerStats.setGoalsScored(inGamePlayerGoals);
        teamStats.setGoalsFor(teamGoalsFor);
        player.setTotalGoalsScored(playerGoals);

        repository.save(gameStats);
        playerStatsRepository.save(playerStats);
        teamStatsRepository.save(teamStats);
        playerRepository.save(player);

    }

    public void updateTeamYellowCards(String fixtureId, String teamId) {
        GameStats gameStats = repository.findGameStatsByFixtureIdAndTeamId(fixtureId, teamId);

        int  currentYellow = gameStats.getYellowCards();
        currentYellow++;

        gameStats.setYellowCards(currentYellow);
        repository.save(gameStats);

    }

    public void updateTeamRedCards(String fixtureId, String teamId) {
        GameStats gameStats = repository.findGameStatsByFixtureIdAndTeamId(fixtureId, teamId);

        int  currentRed = gameStats.getYellowCards();
        currentRed++;

        gameStats.setYellowCards(currentRed);
        repository.save(gameStats);

    }

}
