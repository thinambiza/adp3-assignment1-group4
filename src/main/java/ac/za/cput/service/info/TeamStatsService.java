/**
 TeamStatseService.java
 Service Class for the TeamStats
 Author: Legiste Ndabashinze (217046207)
 */


package ac.za.cput.service.info;

import ac.za.cput.domain.game.Tournament;
import ac.za.cput.domain.info.TeamStats;
import ac.za.cput.repository.TeamRepository;
import ac.za.cput.repository.TeamStatsRepository;
import ac.za.cput.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TeamStatsService {

    @Autowired
    private TeamStatsRepository repository;

    @Autowired
    private TournamentRepository tournamentRepository;
    @Autowired
    private TeamRepository teamRepository;

    public TeamStats save(TeamStats teamStats){
        return repository.save(teamStats);
    }

    public Set<TeamStats> getTeamStatByTeamId(String tournamentId, String teamId){

        Tournament tournament = tournamentRepository.findById(tournamentId).get();
        Set<TeamStats> teamSet = tournament.getTournamentTeamStats();

        return repository.findByTeamId(teamId);

    }

}
