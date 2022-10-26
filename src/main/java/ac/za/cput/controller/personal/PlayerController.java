/**
 * Player Controller
 * PlayerController.java
 * Thina Mbiza 217217095
 * 19 October 2022
 */
package ac.za.cput.controller.personal;

import ac.za.cput.domain.personal.Player;
import ac.za.cput.service.personal.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService service;

    @GetMapping("/fms/player/all")
    public List<ac.za.cput.domain.personal.Player> getAllPlayers(){
        return service.getAllPlayers();
    }

    @GetMapping("/fms/player/{playerId}")
    public List<ac.za.cput.domain.personal.Player> getPlayerById(@PathVariable(required = false) String playerId){
        return service.getPlayerById(playerId);
    }

    @PostMapping("/fms/player/save")
    public ac.za.cput.domain.personal.Player save(@RequestBody ac.za.cput.domain.personal.Player player){
        return service.save(player);
    }

    @DeleteMapping("/fms/player/{playerId}/delete")
    public ResponseEntity deletePlayerById(@PathVariable String playerId){
        service.deletePlayerById(playerId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PatchMapping("/fms/player/{playerId}/update")
    public Player updatePlayer(@PathVariable String playerId, String firsName, String middleName, String lastName, String position, int positionNumber){
        return service.updatePlayer(playerId, firsName, middleName, lastName, position, positionNumber);
    }



}
