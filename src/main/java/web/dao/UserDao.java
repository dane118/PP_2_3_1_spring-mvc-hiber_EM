package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addOrUpdateUser(User user);
    User getById(Long id);
    void deleteUser(User user);

}
