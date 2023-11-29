package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImplEntityManager implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createNativeQuery("select * from my_db.users;", User.class).getResultList();

//        return sessionFactory
//                .getCurrentSession()
//                .createQuery("from User", User.class)
//                .list();
    }

    @Override
    public void addOrUpdateUser(User user) {
        entityManager.persist(entityManager.contains(user) ? user : entityManager.merge(user));
//        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public User getById(Long id) {
        return  entityManager.find(User.class, id);
//        User user = sessionFactory.getCurrentSession().get(User.class, id);
//        return null;
    }

    @Override
    public void deleteUser(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
//        entityManager.remove(user);
//        sessionFactory.getCurrentSession().delete(user);
    }
}
