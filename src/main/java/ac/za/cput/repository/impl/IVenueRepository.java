/**
 IVenueRepository.java
 Repository interface for the Venue
 Author: Legiste Ndabashinze (217046207)
 Date: 07 April 2022
 */

package ac.za.cput.repository.impl;

import ac.za.cput.entity.Venue;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface IVenueRepository extends IRepository<Venue, String> {
    Set<Venue> getAll();
}
