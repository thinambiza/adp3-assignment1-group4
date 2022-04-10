/**
 IPlayerRepository.java
 Repository interface for the Player
 Author: Thina Mbiza 217217095
 Date: 10 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Player;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface IPlayerRepository  extends IRepository<Player, String> {
    Set<Player> getAll();
}

