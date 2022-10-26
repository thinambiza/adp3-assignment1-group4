/**
 PlayerStatsService.java
 Service for PlayerStats
 Author: Zuko Fukula (217299911)
 Date: 17 October 2022
 */

package ac.za.cput.service.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import ac.za.cput.domain.game.Fixture;
import ac.za.cput.domain.game.Team;
import ac.za.cput.domain.game.Tournament;
import ac.za.cput.domain.info.GameStats;
import ac.za.cput.domain.info.PlayerStats;
import ac.za.cput.domain.personal.Player;
import ac.za.cput.repository.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class PlayerStatsService {

    @Autowired
    private PlayerStatsRepository repository;
    @Autowired
    private TournamentRepository tournamentRepository;
    @Autowired
    private FixtureRepository fixtureRepository;
    @Autowired
    private GameStatsRepository gameStatsRepository;
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PlayerStatsRepository playerStatsRepository;


    public PlayerStats save(PlayerStats playerStats){
        return repository.save(playerStats);
    }

    // TODO: Update playerStats during a Fixture and reflect(Update) to GameState and TeamStats
    /*
    Possible Steps to complete this:

    1. get playerStat by id,
    2. update a single value...
    3.

    * */

    public List<PlayerStats> getPlayerStatsById(String playerStatsId){
        if (null != playerStatsId){
            return repository.findAllById(Collections.singleton(playerStatsId));
        }
        else {
            return repository.findAll();
        }
    }

    public List<PlayerStats> getAllPlayerStats(){
        List<PlayerStats> playerStats = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(playerStats::add);
        return playerStats;
    }

    public Set<PlayerStats> getFixtureTeamPlayerStats(String fixtureId, String teamId){
        return repository.getPlayerStatsByFixtureIdAndTeamId(fixtureId, teamId);
    }
    public void deletePlayerStatsById(String id){
        repository.deleteById(id);
    }
    public void updatePlayerStatGoalPlusOneById(String tour, String fix, String game, String teamId, String playerId, String playerStatId){

        Tournament tournament = tournamentRepository.findById(tour).get();
        Fixture fixture = fixtureRepository.findById(fix).get();
        GameStats gameStats = gameStatsRepository.findById(game).get();
        Team team = teamRepository.findById(teamId).get();
        Player player = playerRepository.findById(playerId).get();
        PlayerStats playerStat = playerStatsRepository.findById(playerId).get();

    }
}
