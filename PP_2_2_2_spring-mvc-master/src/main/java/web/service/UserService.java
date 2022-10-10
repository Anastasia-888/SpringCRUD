package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void add(User user);
    User getUserById(int id);
    void update(int id, User newUser);
    void delete(User user);
}
