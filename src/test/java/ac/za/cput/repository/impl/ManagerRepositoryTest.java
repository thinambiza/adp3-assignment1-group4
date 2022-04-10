/**
 ManagerRepositoryTest.java
 Test case class for the Manager Repository
 Author: Panashe Muinzani (218186568)
 Date: 09 April 2022
 */

package ac.za.cput.repository.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ac.za.cput.entity.Manager;
import ac.za.cput.factory.ManagerFactory;
import static org.junit.jupiter.api.Assertions.*;

class ManagerRepositoryTest {
    ManagerRepository repository;
    Manager manager;

    @BeforeEach
    public void setUp() throws Exception {
        repository = ManagerRepository.getRepository();
        manager = ManagerFactory.createManager("T1"
                , "James"
                , 54
                , 35
                , "Darwin"
                , "Franklin");
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void create() {
        repository.create(manager);
        assertNotNull(repository.read(manager.getManagerId()));
        System.out.println("Created\n" + repository.read(manager.getManagerId()));
    }

//    @Test
//    public void read() {
//            assertNotNull(managerRepository.read(manager.getManagerId()));
//            System.out.println(managerRepository.read(manager.getManagerId()));
//        }

//    @Test
//    public void update() {
//        System.out.println("Before update: " + manager.toString());
//        Manager updated = new Manager.Builder().copy(manager).setLastName("Muinzani").setYearsOfExperience(10).build();
//        Manager updatedManager = repository.update(updated);
//        Assertions.assertEquals("Muinzani", updatedManager.getLastName());
//        System.out.println("Updated: "+ updatedManager);
//    }

    @Test
    public void delete() {
        repository.delete("James");
        assertNull(repository.read("James"));
        System.out.println("Deleted\n" + repository.read("James"));

    }
    @Test
    void getAll() {
        System.out.println("Show All");
        System.out.println(repository.getAll());
    }
}
