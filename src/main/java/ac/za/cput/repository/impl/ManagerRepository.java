/**
 ManagerRepository.java
 Repository class for the Manager
 Author: Panashe Muinzani (218186568)
 Date: 09 April 2022
 */

package ac.za.cput.repository.impl;
import ac.za.cput.entity.Manager;

import java.util.HashSet;
import java.util.Set;

public class ManagerRepository implements IManagerRepository{

    private static ManagerRepository repository = null;
    private Set<Manager> managerDB;

    private ManagerRepository() {managerDB = new HashSet<Manager>();}
    public static ManagerRepository getRepository(){
        if (repository == null){
            repository = new ManagerRepository();
        }
        return repository;
    }

    @Override
    public Manager create(Manager manager) {
        managerDB.add(manager);
        return null;
    }

    @Override
    public Manager read(String s) {
        for(Manager manager: managerDB)
            if(manager.getManagerId() == s)
                return manager;
        return null;
    }

    @Override
    public Manager update(Manager manager) {
        for(Manager i: managerDB)
            if(i.getManagerId() == manager.getManagerId()) {
                managerDB.remove(i);
                managerDB.add(manager);
                return manager;
            }
        return null;
    }

    @Override
    public boolean delete(String s) {
        for(Manager manager: managerDB)
            if(manager.getManagerId() == s) {
               managerDB.remove(manager);
                return true;
            }
        return false;
    }

    @Override
    public Set<Manager> getAll() {
        return null;
    }
}
