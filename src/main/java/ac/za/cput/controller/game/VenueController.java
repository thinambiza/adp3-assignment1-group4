/**
 * Venue Controller
 * VenueController.java
 * Author: Thina Mbiza 217217095
 * Date 18 October 2022
 */

package ac.za.cput.controller.game;

import ac.za.cput.domain.game.Venue;
import ac.za.cput.service.game.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VenueController {

    @Autowired
    private VenueService service;

    @GetMapping("/fms/venue/all")
    public List<Venue> getAllVenues(){
        return service.getAllVenues();
    }

    @PostMapping("/fms/venue/save")
    public Venue save(@RequestBody Venue venue){
        return service.save(venue);
    }

    @GetMapping("/fms/venue/{venueId}")
    public List<Venue> getVenueById(@PathVariable String venueId){
        return service.getVenueById(venueId);
    }

    @PatchMapping("/fms/venue/{venueId}/update")
    public Venue updateVenue(@PathVariable String venueId, String venueName, int capacity){
        return service.updateVenue(venueId, venueName, capacity);
    }

    @DeleteMapping("/fms/venue/{venueId}/delete")
    public void deleteVenue(@PathVariable String venueId){
        service.deleteVenueById(venueId);
    }

}
