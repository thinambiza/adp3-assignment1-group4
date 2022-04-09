/**
 ILogRepository.java
 Interface for the Log Repository
 Author: Zuko Fukula (217299911)
 Date: 08 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Log;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface ILogRepository extends IRepository<Log, String> {
    Set<Log> getAll();
}


