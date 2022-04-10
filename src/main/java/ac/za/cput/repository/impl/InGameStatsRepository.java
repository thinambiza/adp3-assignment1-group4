/**
 * InGameStats.java
 * InGame Stats Repository
 * Author: Melisa Bhixa 217131085
 * Date: 9 April 2022
 */


package ac.za.cput.repository.impl;

import ac.za.cput.entity.InGameStats;

import java.util.HashSet;
import java.util.Set;


public class InGameStatsRepository implements IInGameStatsRepository {
   private static InGameStatsRepository repository = null;
   private Set<InGameStats> inGameStatsSetDataBase = null;

   private InGameStatsRepository(){
      inGameStatsSetDataBase = new HashSet<InGameStats>();
   }

   public static InGameStatsRepository getRepository(){
      if (repository == null){
         repository = new InGameStatsRepository();
      }
      return repository;
   }

   @Override
   public InGameStats create(InGameStats inGameStats) {
      boolean success = inGameStatsSetDataBase.add(inGameStats);
      if (!success){
         return null;
      }
      return inGameStats;
   }

   @Override
   public InGameStats read(String fixtureId) {
      for (InGameStats inGameStats : inGameStatsSetDataBase)
         if (inGameStats.getFixtureIdId().equalsIgnoreCase(fixtureId)){
            return inGameStats;
         }
      return null;
   }

   @Override
   public InGameStats update(InGameStats inGameStats) {
      InGameStats oldInGameStats = read(inGameStats.getFixtureIdId());
      if (oldInGameStats != null){
         inGameStatsSetDataBase.remove(oldInGameStats);
         inGameStatsSetDataBase.add(inGameStats);
         return inGameStats;
      }
      return null;
   }

   @Override
   public boolean delete(String fixtureId) {
      InGameStats inGameStatsToDelete = read(fixtureId);
      if (inGameStatsToDelete == null){
         return false;
      }else{
         inGameStatsSetDataBase.remove(inGameStatsToDelete);
         return true;
      }
   }

   @Override
   public Set<InGameStats> getAll() {
      return this.inGameStatsSetDataBase;
   }

}



