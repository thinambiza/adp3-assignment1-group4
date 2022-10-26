/**
 RefereeController.java
 Controller for Referee
 Author: Zuko Fukula (217299911)
 Date: 17 October 2022
 */

package ac.za.cput.controller.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ac.za.cput.domain.personal.Referee;
import ac.za.cput.service.personal.RefereeService;

import java.util.List;

@RestController
public class RefereeController {


    @Autowired
    private RefereeService service;

    @GetMapping("/fms/referee/all")
    public List<Referee> getAllReferees(){
        return service.getAllReferees();
    }

    @GetMapping("/fms/referee/{refereeId}")
    public List<Referee> getRefereeById(@PathVariable(required = false) String refereeId){
        return service.getRefereeById(refereeId);
    }

    @PostMapping("/fms/referee/save")
    public Referee save(@RequestBody Referee referee){
        return service.save(referee);
    }

    @DeleteMapping("/fms/referee/{refereeId}/delete")
    public ResponseEntity deleteRefereeById(@PathVariable String refereeId){
        service.deleteRefereeById(refereeId);
        return new ResponseEntity(HttpStatus.OK);
    }

}
