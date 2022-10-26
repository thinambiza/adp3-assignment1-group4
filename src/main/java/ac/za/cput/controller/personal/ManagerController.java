/**
 Author: Panashe Muinzani (218186568)
 */
package ac.za.cput.controller.personal;

import ac.za.cput.domain.personal.Manager;
import ac.za.cput.service.personal.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManagerController {

    @Autowired
    private ManagerService service;

    @GetMapping("/fms/manager/all")
    public List<Manager> getAllManagers(){
        return service.getAllManagers();
    }

    @GetMapping("/fms/manager/{managerId}")
    public List<Manager> getManagerById(@PathVariable(required = false) String managerId){
        return service.getManagerById(managerId);
    }

    @PostMapping("/fms/manager/save")
    public Manager save(@RequestBody Manager manager){
        return service.save(manager);
    }

    @DeleteMapping("/fms/manager/{managerId}/delete")
    public ResponseEntity deleteManagerById(@PathVariable String managerId){
        service.deleteManagerById(managerId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PatchMapping("/fms/manager/{managerId}/update")
    public Manager updateManager(@PathVariable String managerId, String fName, String mName, String lName){
        return service.updateManager(managerId, fName, mName, lName);
    }

}

