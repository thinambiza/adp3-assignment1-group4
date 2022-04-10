/**
 TeamRepositoryTest.java
 Test case class for the Team Repository
 Author: Panashe Muinzani (218186568)
 Date: 09 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Manager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ac.za.cput.entity.Team;
import ac.za.cput.factory.TeamFactory;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class TeamRepositoryTest {
    TeamRepository repository;
    Team team;

    @BeforeEach
    public void setUp() throws Exception {
        repository = TeamRepository.getRepository();
        team =  TeamFactory.createTeam("33335252f"
                , "Liverpool"
                , 7
                , 2000
                , "James"
                , "Darwim"
                , "Franklin, James, Rocky");
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void create() {
        repository.create(team);
        assertNotNull(repository.read(team.getTeamId()));
        System.out.println("Created\n" + repository.read(team.getTeamId()));
    }
//    @Test
//    public void read() {
//        assertNotNull(repository.read(team.getTeamId()));
//        System.out.println("Read\n" + repository.read(team.getTeamId()));
//   }
//
//    @Test
//    public void update() {
//        Team updated = new Team.Builder().copy(team).setManager("Sharon").build();
//        assertNotNull(repository.update(updated));
//        assertEquals(team.getTeamId(), updated.getTeamId());
//        System.out.println("Update: " + updated);
@Test
public void delete() {
    repository.delete("Liverpool");
    assertNull(repository.read("Liverpool"));
    System.out.println("Deleted\n" + repository.read("Liverpool"));

}
    @Test
    void getAll() {
        System.out.println("Show All");
        System.out.println(repository.getAll());
    }
}


