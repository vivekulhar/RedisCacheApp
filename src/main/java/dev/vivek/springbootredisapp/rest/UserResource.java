package dev.vivek.springbootredisapp.rest;

import dev.vivek.springbootredisapp.model.User;
import dev.vivek.springbootredisapp.respository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
    private UserRepository userRepository;

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @PostMapping(value="/add",consumes = "application/json")
    public User add(@RequestBody User user) {
        userRepository.save(user);
        return userRepository.findById(user.getId());
    }

    @PutMapping("/update/{id}/{name}")
    public User update(@PathVariable("id") final String id,
                       @PathVariable("name") final String name) {
        userRepository.update(new User(id, name, 10000L));
        return userRepository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public Map<String, User> delete(@PathVariable("id") final String id) {
        userRepository.delete(id);
        return all();
    }
    @GetMapping("/all")
    public Map<String, User> all() {
        return userRepository.findAll();
    }


}
