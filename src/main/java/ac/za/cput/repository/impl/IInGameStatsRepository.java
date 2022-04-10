/**
 * IInGameStats.java
 * InGame Stats Repository Interface
 * Author: Melisa Bhixa 217131085
 * Date: 9 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.InGameStats;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface IInGameStatsRepository extends IRepository<InGameStats, String> {
    InGameStats create(InGameStats inGameStats);

    InGameStats read(String fixtureId);

    InGameStats update(InGameStats inGameStats);

    boolean delete(String fixtureId);

    Set<InGameStats> getAll();
}