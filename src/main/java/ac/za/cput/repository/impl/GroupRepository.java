/**
 GroupRepository.java
 Repository class for the Group
 Author: Thina Mbiza 217217095
 Date: 10 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Group;
import java.util.HashSet;
import java.util.Set;

public class GroupRepository {

        private static ac.za.cput.repository.impl.GroupRepository repository = null;
        private Set<Group> groupDatabase = null;

        private GroupRepository(){
            groupDatabase = new HashSet<Group>();
        }

        public static ac.za.cput.repository.impl.GroupRepository getRepository(){
            if (repository == null){
                repository = new ac.za.cput.repository.impl.GroupRepository();
            }
            return repository;
        }


        public Group create(Group group) {
            boolean success = groupDatabase.add(group);
            if (!success){
                return null;
            }
            return group;
        }


        public Group read(String groupId) {
            for (Group group : groupDatabase)
                if (group.getGroupId().equalsIgnoreCase(groupId)){
                    return group;
                }
            return null;
        }


        public Group update(Group group) {
            Group oldGroup = read(group.getGroupId());
            if (oldGroup != null){
                groupDatabase.remove(oldGroup);
                groupDatabase.add(group);
                return group;
            }
            return null;
        }


        public boolean delete(String groupId) {
            Group groupToDelete = read(groupId);
            if (groupToDelete == null)
                return false;
            groupDatabase.remove(groupToDelete);
            return false;
        }

        public Set<Group> getAll() {
            return groupDatabase;
        }
    }


