
package com.mynotebook.service;

import com.mynotebook.model.User;
import com.mynotebook.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    } 
    
    @Override
    public User updateUser(Integer id, User user) {

        User existingUser = userRepository.findById(id).orElse(null);

        if (existingUser != null) {

            existingUser.setFirstName(user.getFirstName());
            existingUser.setLastName(user.getLastName());
            existingUser.setUsername(user.getUsername());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            existingUser.setProfileImage(user.getProfileImage());

            return userRepository.save(existingUser);
        }
        return null;
    }
    
    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
    
    @Override
    public User login(String username, String password) {

    User user = userRepository
            .findByUsername(username)
            .orElse(null);

    if (user != null &&
        user.getPassword().equals(password)) {

        return user;
    }

    return null;
    }
}
