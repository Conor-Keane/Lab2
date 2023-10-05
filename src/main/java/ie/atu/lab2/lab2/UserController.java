package ie.atu.lab2.lab2;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService us;

    @Autowired
    public UserController() {
        us = new UserService();
    }

    @GetMapping("newUser1/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email) {

    }
}
