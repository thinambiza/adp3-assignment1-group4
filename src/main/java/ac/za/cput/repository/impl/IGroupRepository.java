/**
 IGroupRepository.java
 Repository interface for the Group
 Author: Thina Mbiza 217217095
 Date: 10 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Group;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface IGroupRepository extends IRepository<Group, String> {
        Set<Group> getAll();
        }

