package com.example.dz_12.controllers;

import com.example.dz_12.model.secuirty.ApplicationUser;
import com.example.dz_12.repositories.ApplicationUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {
    private final PasswordEncoder passwordEncoder;
    private final ApplicationUserRepository applicationUserRepository;

    @PostMapping("/registration")
    public String registration(@RequestParam String email,@RequestParam String password){
        ApplicationUser applicationUser = new ApplicationUser(email,passwordEncoder.encode(password));
        applicationUserRepository.save(applicationUser);
        return "redirect:/";
    }
}
