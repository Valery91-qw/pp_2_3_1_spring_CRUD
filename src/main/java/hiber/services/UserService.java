package hiber.services;

import java.util.List;

import hiber.models.User;

public interface UserService {
    void create(User user);
    User get(long id);
    void update(User user);
    void delete(User user);
    List<User> listUsers();
}
