/**
 PlayerStats.java
 Controller for PlayerStats
 Author: Zuko Fukula (217299911)
 Date: 17 October 2022
 */

package ac.za.cput.controller.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ac.za.cput.domain.info.PlayerStats;
import ac.za.cput.service.info.PlayerStatsService;

import java.util.List;

@RestController
public class PlayerStatsController {


    @Autowired
    private PlayerStatsService service;

    @GetMapping("/fms/playerStats/all")
    public List<PlayerStats> getAllPlayerStats(){
        return service.getAllPlayerStats();
    }

    @GetMapping("/fms/playerStats/{playerStatsId}")
    public List<PlayerStats> getPlayerStatsById(@PathVariable(required = false) String playerStatsId){
        return service.getPlayerStatsById(playerStatsId);
    }

    @PostMapping("/fms/playerStats/save")
    public PlayerStats save(@RequestBody PlayerStats playerStats){
        return service.save(playerStats);
    }

   /* @PostMapping("/update")
    public PlayerStats updatePlayerStatGoalPlusOneById(@RequestBody PlayerStats playerStats){
        return service.updatePlayerStatGoalPlusOneById();
    }*/

    @DeleteMapping("/fms/playerStats/{playerStatsId}/delete")
    public ResponseEntity deletePlayerStatsById(@PathVariable String playerStatsId){
        service.deletePlayerStatsById(playerStatsId);
        return new ResponseEntity(HttpStatus.OK);
    }

}
