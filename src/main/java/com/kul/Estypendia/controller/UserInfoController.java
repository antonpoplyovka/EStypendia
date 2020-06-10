package com.kul.Estypendia.controller;

import com.kul.Estypendia.model.User;
import com.kul.Estypendia.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Collection;
import java.util.List;

@RestController
public class UserInfoController {

    private UserRepo userRepo;

    @Autowired
    public UserInfoController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/userInfo")
    public User getUserInfo(@AuthenticationPrincipal User user) {
        Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>)    SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        return user;
    }

    @GetMapping("/isAdmin")
    public boolean isAdmin(@AuthenticationPrincipal User user) {

        return user.getEmail().equals("antonpoplyovka@gmail.com") || user.getEmail().equals("inf201621@gmail.com");
    }

    @GetMapping("/")
    public RedirectView redirectWithUsingRedirectView() {
        return new RedirectView("http://localhost:4200/students-list");
    }
    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
