package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String showAllUsers(Model model) {
        System.out.println("sgnksfdbgkjfd");
        model.addAttribute("users", service.getAllUsers());
        return "index";
    }

    @GetMapping(value = "/new")
    public String addNewUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping("/saveOrUpdateUser")
    public String saveUser(@ModelAttribute("user") User user) {
        service.addOrUpdateUser(user);
        return "redirect:/users";
    }

    @PostMapping (value = "/edit")
    public String updateUser(@RequestParam("id") Long id, Model model) {
        model.addAttribute("user", service.getById(id));
        return "edit";
    }

    @PostMapping(value = "/delete")
    public String deleteUser(@RequestParam("id") Long id) {
        service.deleteUser(service.getById(id));
        return "redirect:/users";
    }
}
