package org.example.springapi.service;

import org.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Maria", 32, "maria@mail.com");
        User user2 = new User(2, "Petar", 19, "petar@mail.com");
        User user3 = new User(3, "Georgi", 25, "georgi@mail.com");
        User user4 = new User(4, "Ivan", 28, "ivan@mail.com");
        User user5 = new User(5, "Desislava", 30, "deislava@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList) {
            if(id== user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
