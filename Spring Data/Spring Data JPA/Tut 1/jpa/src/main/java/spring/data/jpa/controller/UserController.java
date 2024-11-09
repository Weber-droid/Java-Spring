package spring.data.jpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.data.jpa.model.User;
import spring.data.jpa.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // @Autowired
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    

}
