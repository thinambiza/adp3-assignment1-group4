/**
 IPlayerStatsRepository.java
 Interface for PlayerStats Repository
 Author: Zuko Fukula (217299911)
 Date: 08 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.PlayerStats;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface IPlayerStatsRepository extends IRepository<PlayerStats, String> {
    Set<PlayerStats> getAll();
}
