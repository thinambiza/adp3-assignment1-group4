/**
 * IInGameStats.java
 *  Tournament Repository Interface
 * Author: Melisa Bhixa 217131085
 * Date: 9 April 2022
 */


package ac.za.cput.repository.impl;

import ac.za.cput.entity.Tournament;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface ITournamentRepository extends IRepository<Tournament, String> {

    Tournament create(Tournament tournament);

    Tournament read(String tournamentId);

    Tournament update(Tournament tournament);

    boolean delete(String tournamentId);

    Set<Tournament> getAll();

}
