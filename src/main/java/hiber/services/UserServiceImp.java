package hiber.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hiber.dao.UserDao;
import hiber.models.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Override
   public void create(User user) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'create'");
   }

   @Override
   public User get() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'get'");
   }

   @Override
   public User update(User user) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'update'");
   }

   @Override
   public void delete(User user) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'delete'");
   }

   @Override
   public List<User> listUsers() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'listUsers'");
   }

   
}
