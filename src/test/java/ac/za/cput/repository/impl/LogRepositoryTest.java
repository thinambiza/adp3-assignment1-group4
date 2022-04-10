/**
 LogRepositoryTest.java
 Test case class for the Log Repository
 Author: Zuko Fukula (217299911)
 Date: 08 April 2022
 */

package ac.za.cput.repository.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ac.za.cput.entity.Log;
import ac.za.cput.factory.LogFactory;

class LogRepositoryTest {

    private static ILogRepository repository = LogRepository.getRepository();

    private static Log log = LogFactory.createLog("A", "L1", "T1", 65, 32, 80, 30, 50, 2);

    @Test
    void create() {
        Assertions.assertNotNull(repository.create(log));

        System.out.println(repository.create(log));
    }

    @Test
    void read() {
        Log readLog = repository.read(log.getLogID());

        Assertions.assertEquals("L1", readLog.getLogID());
        System.out.println("Read: " + readLog);
    }

    @Test
    void update() {
        System.out.println("Pre-update: "+ log.toString());

        Log newLog = new Log.Builder().copy(log).setLogID("L2").build();
        Log updatedLog = repository.update(newLog);

        Assertions.assertEquals("L2",updatedLog.getLogID());

        System.out.println("Post-update: "+ updatedLog);
        System.out.println("Get all: ");
        getAll();
    }

    @Test
    void delete() {
        repository.delete(log.getLogID());

        System.out.println(repository.getAll());
    }

    @Test
    void getAll() {
        Assertions.assertNotNull(repository.getAll());

        System.out.println(repository.getAll());
    }
}
