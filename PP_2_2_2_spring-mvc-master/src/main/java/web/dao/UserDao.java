package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();
    void add(User user);
    User getUserById(int id);
    void update(int id, User newUser);
    void delete(User user);
}
