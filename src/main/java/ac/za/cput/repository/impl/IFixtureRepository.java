/**
 IFixtureRepository.java
 Repository interface for the Fixture
 Author: Legiste Ndabashinze (217046207)
 Date: 07 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Fixture;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface IFixtureRepository extends IRepository<Fixture, String> {
    Set<Fixture> getAll();
}
