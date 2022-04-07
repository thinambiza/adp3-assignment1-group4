package ac.za.cput.repository.impl;

import ac.za.cput.entity.Venue;

import java.util.HashSet;
import java.util.Set;

public class VenueRepository implements IVenueRepository{

    private static VenueRepository repository = null;
    private Set<Venue> venueDatabase = null;

    private VenueRepository(){
        venueDatabase = new HashSet<Venue>();
    }

    public static VenueRepository getRepository(){
        if (repository == null){
            repository = new VenueRepository();
        }
        return repository;
    }

    @Override
    public Venue create(Venue venue) {
        boolean success = venueDatabase.add(venue);
        if (!success){
            return null;
        }
        return venue;
    }

    @Override
    public Venue read(String venueId) {
        for (Venue venue : venueDatabase)
            if (venue.getVenueId().equalsIgnoreCase(venueId)){
                return venue;
            }
        return null;
    }

    @Override
    public Venue update(Venue venue) {
        Venue oldVenue = read(venue.getVenueId());
        if (oldVenue != null){
            venueDatabase.remove(oldVenue);
            venueDatabase.add(venue);
            return venue;
        }
        return null;
    }

    @Override
    public boolean delete(String venueId) {
        Venue venueToDelete = read(venueId);
        if (venueToDelete == null)
            return false;
        venueDatabase.remove(venueToDelete);
        return false;
    }

    @Override
    public Set<Venue> getAll() {
        return null;
    }
}
