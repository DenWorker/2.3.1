package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User newUser);

    void deleteUserById(long userId);

    void editUser(long userId, User updatedUser);

    User getUserById(long userId);

}
