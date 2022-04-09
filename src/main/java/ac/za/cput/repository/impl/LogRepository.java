/**
 LogRepository.java
 Repository for Log
 Author: Zuko Fukula (217299911)
 Date: 08 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Log;
import java.util.HashSet;
import java.util.Set;

public class LogRepository implements ILogRepository
{

    private static LogRepository repository = null;
    private Set<Log> logDB = null;

    public LogRepository(){
        this.logDB= new HashSet<>();
    }

    public static LogRepository getRepository(){
        if (repository == null)
        {
            repository = new LogRepository();
        }
        return repository;
    }

    @Override
    public Log create(Log log){
        boolean success = logDB.add(log);
        if(!success){
            return null;
        }
        return log;
    }

    @Override
    public Log read(String logID){
        for (Log log : this.logDB){
            if (log.getLogID().equalsIgnoreCase(logID));
            {
                return log;
            }

        }
        return null;
    }

    @Override
    public Log update(Log log) {
        delete(log.getLogID());

        this.logDB.add(log);
        return log;
    }

    @Override
    public boolean delete(String log) {
        Log deleteLog = read(log);
        this.logDB.remove(deleteLog);
        return true;
    }

    @Override
    public Set<Log> getAll() {
        return logDB;
    }
}
