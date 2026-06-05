
package com.mynotebook.service;

import com.mynotebook.model.User;
import java.util.List;


public interface UserService {
    
    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Integer id);
    
    User updateUser(Integer id, User user);
    
    void deleteUser(Integer id);
    
    User login(String username, String password);
}
