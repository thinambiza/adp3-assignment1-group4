/**
 * Tournament.java
 * Tournament Controller
 * Author: Melisa Bhixa 217131085
 * Date: 31 March 2022
 */

package ac.za.cput.controller.game;


import ac.za.cput.domain.game.Tournament;
import ac.za.cput.domain.info.TeamStats;
import ac.za.cput.service.game.TournamentService;
import ac.za.cput.service.info.TeamStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class TournamentController {

    @Autowired
    private TournamentService service;

    @Autowired
    private TeamStatsService teamStatsService;

    @GetMapping("/fms/tournament/all")
    public List<Tournament> getAllTournaments(){
        return service.getAllTournaments();
    }

    @GetMapping("/fms/tournament/{tournamentId}")
    public List<Tournament> getTournamentById(@PathVariable(required = false) String tournamentId){
        return service.getTournamentById(tournamentId);
    }

    @PostMapping("/fms/tournament/save")
    /*public ResponseEntity save(@RequestBody Tournament tournament){
        service.save(tournament);
        return new ResponseEntity(HttpStatus.CREATED);
    }*/
    public Tournament save(@RequestBody Tournament tournament){
        return service.save(tournament);
    }

    @DeleteMapping("/fms/tournament/{tournamentId}/delete")
    public ResponseEntity deleteTournamentById(@PathVariable String tournamentId){
        service.deleteById(tournamentId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/fms/team/{teamId}/assign-to/tournament/{tournamentId}")
    public Tournament assignTeamToTournament(@PathVariable String teamId, @PathVariable String tournamentId){
        return service.assignTeamToTournament(teamId, tournamentId);
    }

    @PutMapping("/fms/tournament/{tournamentId}/new-fixture/{fixtureId}")
    public Tournament addNewFixture(@PathVariable String fixtureId, @PathVariable String tournamentId){
        return service.addFixtureToTournament(tournamentId, fixtureId);
    }

    @GetMapping("/fms/tournament/{tournamentId}/stats/")
    public Set<TeamStats> getTournamentTeamStats(@PathVariable String tournamentId){
        return service.getTeamStatsByTournamentId(tournamentId);
    }

}
