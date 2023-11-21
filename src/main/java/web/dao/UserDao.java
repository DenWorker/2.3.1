package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User newUser);

    void deleteUserById(long userId);

    void editUser(long userId, User updatedUser);

    User getUserById(long userId);
}
