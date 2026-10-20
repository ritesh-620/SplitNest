package in.ritesh.splitnest.controller;

import in.ritesh.splitnest.entity.User;
import in.ritesh.splitnest.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
     private final UserService userService;

     public UserController(UserService userService){
         this.userService = userService;

     }

     @PostMapping
    public User saveUser(@RequestBody User user){
         return userService.createUser(user);

     }

     @GetMapping
    public List<User> getAllUsers(@RequestBody User user){
         return userService.getAllUsers();
     }

}
