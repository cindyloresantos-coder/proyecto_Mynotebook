
package com.mynotebook.controller;

import com.mynotebook.model.User;
import com.mynotebook.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
     @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
    
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Integer id,
                       @RequestBody User user) {

        return userService.updateUser(id, user);
    }
    
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {

        userService.deleteUser(id);

        return "El usuario fue eliminado correctamente";
    }
}
