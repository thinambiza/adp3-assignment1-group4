package ac.za.cput.security.controller;

import ac.za.cput.security.domain.User;
import ac.za.cput.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/fms/user/{email}")
    public User getUserByEmail(@PathVariable String email){
        return service.getUserByEmail(email);
    }

    @PutMapping("/fms/user/sign-up")
    public User signUp(User user){
        return service.signUpUser(user);
    }

}
