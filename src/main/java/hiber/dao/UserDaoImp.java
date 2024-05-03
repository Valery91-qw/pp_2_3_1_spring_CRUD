package hiber.dao;

import hiber.models.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(User user) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'add'");
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
