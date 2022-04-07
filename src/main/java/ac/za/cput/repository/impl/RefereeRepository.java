/**
 RefereeRepository.java
 Repository class for the Referee
 Author: Legiste Ndabashinze (217046207)
 Date: 07 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Referee;

import java.util.HashSet;
import java.util.Set;

public class RefereeRepository implements IRefereeRepository{

    private static RefereeRepository repository = null;
    private Set<Referee> refereeDataBase = null;

    private RefereeRepository(){
        refereeDataBase = new HashSet<Referee>();
    }

    public static RefereeRepository getRepository(){
        if (repository == null){
            repository = new RefereeRepository();
        }
        return repository;
    }

    @Override
    public Referee create(Referee referee) {
        boolean success = refereeDataBase.add(referee);
        if (!success){
            return null;
        }
        return referee;
    }

    @Override
    public Referee read(String refereeId) {
        for (Referee referee : refereeDataBase)
            if (referee.getRefereeId().equalsIgnoreCase(refereeId)){
                return referee;
            }
        return null;
    }

    @Override
    public Referee update(Referee referee) {
        Referee oldReferee = read(referee.getRefereeId());
        if (oldReferee != null){
            refereeDataBase.remove(oldReferee);
            refereeDataBase.add(referee);
            return referee;
        }
        return null;
    }

    @Override
    public boolean delete(String refereeId) {
        Referee refereeToDelete = read(refereeId);
        if (refereeToDelete == null)
            return false;
        refereeDataBase.remove(refereeToDelete);
        return false;
    }

    @Override
    public Set<Referee> getAll() {
        return null;
    }
}
