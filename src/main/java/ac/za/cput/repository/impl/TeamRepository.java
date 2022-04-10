/**
 TeamRepository.java
 Repository class for the Team
 Author: Panashe Muinzani (218186568)
 Date: 09 April 2022
 */

package ac.za.cput.repository.impl;
import ac.za.cput.entity.Team;

import java.util.HashSet;
import java.util.Set;

public class TeamRepository implements ITeamRepository{

    private static TeamRepository repository = null;
    private Set<Team> teamDB = null;

    private TeamRepository() {teamDB = new HashSet <Team>();}
    public static TeamRepository getRepository(){
        if (repository == null){
            repository = new TeamRepository();
        }
        return repository;
    }

    @Override
    public Team create(Team team) {
        teamDB.add(team);
        return null;
    }

    @Override
    public Team read(String s) {
        for(Team team: teamDB)
            if(team.getTeamId() == s)
                return team;
        return null;
    }

    @Override
    public Team update(Team team) {
        for(Team i: teamDB)
            if(i.getTeamId() == team.getTeamId()){
                teamDB.remove(i);
                teamDB.add(team);
                return team;
            }
        return null;
    }

    @Override
    public boolean delete(String s) {
        for(Team team: teamDB)
            if(team.getTeamId() == s){
                teamDB.remove(team);
                return true;
            }
        return false;
    }

    @Override
    public Set<Team> getAll() {
        return null;
    }
}
