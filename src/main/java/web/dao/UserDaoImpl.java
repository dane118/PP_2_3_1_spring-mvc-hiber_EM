//package web.dao;
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import web.model.User;
//
//import java.util.List;
//
//@Repository
//public class UserDaoImpl implements UserDao {
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//    public List<User> getAllUsers() {
//        return sessionFactory
//                .getCurrentSession()
//                .createQuery("from User", User.class)
//                .list();
//    }
//
//    @Override
//    public void addOrUpdateUser(User user) {
//        sessionFactory.getCurrentSession().saveOrUpdate(user);
//    }
//
//    @Override
//    public User getById(Long id) {
//        User user = sessionFactory.getCurrentSession().get(User.class, id);
//        return user;
//    }
//
//    @Override
//    public void deleteUser(User user) {
//        sessionFactory.getCurrentSession().delete(user);
//    }
//}
