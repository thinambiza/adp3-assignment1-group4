/**
 * Tournament.java
 * Tournament Repository
 * Author: Melisa Bhixa 217131085
 * Date: 9 April 2022
 */


package ac.za.cput.repository.impl;

import ac.za.cput.entity.Tournament;

import java.util.HashSet;
import java.util.Set;

public class TournamentRepository implements ITournamentRepository {
    private static TournamentRepository repository = null;
    private Set<Tournament> tournamentDatabase = null;

    private TournamentRepository(){
        tournamentDatabase = new HashSet<Tournament>();
    }

    public static TournamentRepository getRepository(){
        if (repository == null){
            repository = new TournamentRepository();
        }
        return repository;
    }

    @Override
    public Tournament create(Tournament tournament) {
        boolean success = tournamentDatabase.add(tournament);
        if (!success){
            return null;
        }
        return tournament;
    }

    @Override
    public Tournament read(String tournamentId) {
        for (Tournament tournament : tournamentDatabase)
            if (tournament.getTournamentId().equalsIgnoreCase(tournamentId)){
                return tournament;
            }
        return null;
    }

    @Override
    public Tournament update(Tournament tournament) {
        Tournament oldTournament = read(tournament.getTournamentId());
        if (oldTournament != null){
            tournamentDatabase.remove(oldTournament);
            tournamentDatabase.add(tournament);
            return tournament;
        }
        return null;
    }

    @Override
    public boolean delete(String tournamentId) {
        Tournament tournamentToDelete = read(tournamentId);
        if (tournamentToDelete == null){
            return false;
        }else{
            tournamentDatabase.remove(tournamentToDelete);
            return true;
        }
    }

    @Override
    public Set<Tournament> getAll() {
        return this.tournamentDatabase;
    }

}
