package ac.za.cput.repository.impl;

import ac.za.cput.entity.Group;
import ac.za.cput.entity.Player;
import ac.za.cput.factory.GroupFactory;
import ac.za.cput.factory.PlayerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupRepositoryTest {

    private static GroupRepository repository = (GroupRepository) GroupRepository.getRepository();
    private static Group group = GroupFactory.createGroup("B", 2, 'P', 16, null, "T1");

    @Test
    void create() {
        Assertions.assertNotNull(repository.create(group));
        System.out.println(repository.create(group));
    }


    @Test
    void read() {
        Group read = repository.read(group.getGroupId());
        System.out.println("Read " + read);
    }

    @Test
    void update() {
        Group updatedGroup = new Group.Builder().copy(group).setGroupId("A").build();
        System.out.println("Updated " + updatedGroup);

        Assertions.assertEquals(2,updatedGroup.getGroupLetter());

        System.out.println("Post-update: "+ updatedGroup);
        System.out.println("Get all: ");
        getAll();
    }

    @Test
    void delete() {
        repository.delete(group.getGroupId());
        System.out.println(repository.getAll());
    }

    @Test
    void getAll() {
        Assertions.assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }




}