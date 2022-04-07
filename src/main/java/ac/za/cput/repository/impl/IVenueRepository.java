package ac.za.cput.repository.impl;

import ac.za.cput.entity.Venue;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface IVenueRepository extends IRepository<Venue, String> {
    Set<Venue> getAll();
}
