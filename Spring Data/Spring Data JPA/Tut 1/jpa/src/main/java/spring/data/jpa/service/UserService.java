package spring.data.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import spring.data.jpa.model.User;
import spring.data.jpa.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    // @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }



}
