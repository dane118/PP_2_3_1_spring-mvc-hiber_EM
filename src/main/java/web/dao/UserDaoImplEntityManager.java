package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDaoImplEntityManager implements UserDao {
    @Autowired
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
//        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public User getById(Long id) {
//        User user = sessionFactory.getCurrentSession().get(User.class, id);
        return null;
    }

    @Override
    public void deleteUser(User user) {
//        sessionFactory.getCurrentSession().delete(user);
    }
}
