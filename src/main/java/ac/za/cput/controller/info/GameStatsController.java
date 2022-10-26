/**
 * Game Stats.java
 * Game Stats Controller
 * Author: Melisa Bhixa 217131085
 * Date: 31 March 2022
 */

package ac.za.cput.controller.info;

import ac.za.cput.domain.info.GameStats;
import ac.za.cput.service.info.GameStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameStatsController {

    @Autowired
    private GameStatsService service;


    @GetMapping("/fms/team/{fixtureId}/team/{teamId}")
    public GameStats getGameStatByFixtureIdAndTeamId(@PathVariable String fixtureId , @PathVariable String teamId){
        return service.getGameStatByFixtureIdAndTeamId(fixtureId, teamId);
    }

    @PatchMapping("/fms/tournament/{tournamentId}/fixture/{fixtureId}/team/{teamId}/game-stat/player/{playerId}")
    public void teamGoalScoredUpdate(@PathVariable String tournamentId, @PathVariable String fixtureId, @PathVariable String teamId, @PathVariable String playerId){
        service.teamScoredUpdate(tournamentId, fixtureId, teamId, playerId);
    }

    @PatchMapping("/fms/fixture/{fixtureId}/team/{teamId}/game-stat-up-date-yellow")
    public void teamYellowUpdate(@PathVariable String fixtureId, @PathVariable String teamId){
        service.updateTeamYellowCards(fixtureId, teamId);
    }

    @PatchMapping("/fms/fixture/{fixtureId}/team/{teamId}/game-stat-up-date-red")
    public void teamRedUpdate(@PathVariable String fixtureId, @PathVariable String teamId){
        service.updateTeamRedCards(fixtureId, teamId);
    }

}

