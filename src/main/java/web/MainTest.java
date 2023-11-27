//package web;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import web.config.WebConfig;
//import web.model.User;
//import web.service.UserService;
//
//import java.sql.SQLException;
//import java.util.List;
//
//public class MainTest {
//    public static void main(String[] args) throws SQLException {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(WebConfig.class);
//
//        UserService userService = context.getBean(UserService.class);
//
//        userService.addUser(new User("User1", "Lastname1", (byte) 25,1000));
//        userService.addUser(new User("User2", "Lastname2", (byte) 35,5000));
//        userService.addUser(new User("User3", "Lastname3", (byte) 45,10000));
//        userService.addUser(new User("User4", "Lastname4", (byte) 55,25000));
//
//        List<User> users = userService.getAllUsers();
//        for (User user : users) {
//            System.out.println("Id = " + user.getId());
//            System.out.println("Name = " + user.getName());
//            System.out.println("Surname = " + user.getSurname());
//            System.out.println("Age = " + user.getAge());
//            System.out.println("Salary = " + user.getSalary());
//            System.out.println("---------------------------");
//        }
//
//        context.close();
//    }
//}
