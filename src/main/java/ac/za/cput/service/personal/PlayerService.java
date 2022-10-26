/**
 * Player Service
 * PlayerService.java
 * Author: Thina Mbiza 217217095
 * Date: 10 April 2022
 * */

package ac.za.cput.service;

import ac.za.cput.entity.Player;
import ac.za.cput.repository.impl.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    public Player save(Player player){
        player.setTotalGoalsScored(0);
        player.setTotalAssistsMade(0);
        return repository.save(player);
    }

    public List<Player> getAllPlayers(){
        List<Player> players = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(players::add);
        return players;
    }

    public void deletePlayerById(String id){
        repository.deleteById(id);
    }

    public List<Player> getPlayerById(String id){
        if (null != id){
            return repository.findAllById(Collections.singleton(id));
        }
        else {
            return repository.findAll();
        }
    }

    public Player updatePlayer(String id, String firstName, String middleName, String lastName, String position, int positionNumber){

        Player player = repository.findById(id).get();
        player.setFirstName(firstName);
        player.setMiddleName(middleName);
        player.setLastName(lastName);
        player.setPosition(position);
        player.setPositionNumber(positionNumber);

        return repository.save(player);

    }


}
