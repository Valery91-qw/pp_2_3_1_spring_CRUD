package hiber.dao;

import hiber.models.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   User get(Long id);
   void update(User user);
   void delete(User user);
   List<User> listUsers();
}
