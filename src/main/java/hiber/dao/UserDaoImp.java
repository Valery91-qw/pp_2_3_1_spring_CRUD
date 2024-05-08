package hiber.dao;

import hiber.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Repository
@Transactional
public class UserDaoImp implements UserDao {

   @PersistenceContext
   private EntityManager entityManager;

   @Transactional
   @Override
   public void add(User user) {
      entityManager.persist(user);
      entityManager.flush();
   }

   @Override
   public User get(Long id) {
      User user = entityManager.find(User.class, id);
      entityManager.flush();
      return user;
   }

   @Override
   public void update(User user) {
      entityManager.merge(user);
      entityManager.flush();
   }

   @Override
   public void delete(User user) {
      user = entityManager.merge(user);
      entityManager.remove(user);
      entityManager.flush();
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      List<User> users = entityManager.createQuery("from User").getResultList();
      entityManager.flush();
      return users;
   }

}
