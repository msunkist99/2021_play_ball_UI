package org.launchcode.play_ball_UI.controllers;

import org.launchcode.play_ball_UI.models.User;
import org.launchcode.play_ball_UI.models.dataTransferObjects.LoginFormDataTransferObject;
import org.launchcode.play_ball_UI.models.dataTransferObjects.RegisterFormDataTransferObject;
import org.launchcode.play_ball_UI.models.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Optional;

@Controller
public class AuthenticationController {

    @Autowired
    UserRepository userRepository;

    private static final String userSessionKey = "user";

    // The HttpSession class handles the details of session creation and lookup for us, including generating unique session IDs and session cookies.

    public User getUserFromSession(HttpSession session) {
        Integer userId = (Integer) session.getAttribute(userSessionKey);
        if (userId == null) {
            return null;
        }

        Optional<User> user = userRepository.findById(userId);

        if (user.isEmpty()) {
            return null;
        }

        return user.get();
    }

    private static void setUserInSession(HttpSession session, User user) {
        session.setAttribute(userSessionKey, user.getId());
    }

    @GetMapping("playball/register")
    public String displayRegistrationForm(Model model) {
        model.addAttribute(new RegisterFormDataTransferObject());
        model.addAttribute("title", "Register");
        return "register";
    }

    @PostMapping("playball/register")
    public String processRegistrationForm(@ModelAttribute @Valid RegisterFormDataTransferObject registerFormDataTransferObject,
                                          Errors errors, HttpServletRequest request,
                                          Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Register");
            return "register";
        }

        User existingUser = userRepository.findByUsername(registerFormDataTransferObject.getUsername());

        if (existingUser != null) {
            errors.rejectValue("username", "username.alreadyexists", "A user with that username already exists");
            model.addAttribute("title", "Register");
            return "register";
        }

        String password = registerFormDataTransferObject.getPassword();
        String verifyPassword = registerFormDataTransferObject.getVerifyPassword();
        if (!password.equals(verifyPassword)) {
            errors.rejectValue("password", "passwords.mismatch", "Passwords do not match");
            model.addAttribute("title", "Register");
            return "register";
        }

        User newUser = new User(registerFormDataTransferObject.getUsername(), registerFormDataTransferObject.getPassword());
        userRepository.save(newUser);
        setUserInSession(request.getSession(), newUser);

        return "redirect:";
    }

    @GetMapping("playball/login")
    public String displayLoginForm(Model model) {
        model.addAttribute(new LoginFormDataTransferObject());
        model.addAttribute("title", "Log In");
        return "login";
    }

    @PostMapping("playball/login")
    public String processLoginForm(@ModelAttribute @Valid LoginFormDataTransferObject loginFormDataTransferObject,
                                   Errors errors, HttpServletRequest request,
                                   Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Log In");
            return "login";
        }

        User theUser = userRepository.findByUsername(loginFormDataTransferObject.getUsername());

        if (theUser == null) {
            errors.rejectValue("username", "user.invalid", "The given username does not exist");
            model.addAttribute("title", "Log In");
            return "login";
        }

        String password = loginFormDataTransferObject.getPassword();

        if (!theUser.isMatchingPassword(password)) {
            errors.rejectValue("password", "password.invalid", "Invalid password");
            model.addAttribute("title", "Log In");
            return "login";
        }

        setUserInSession(request.getSession(), theUser);

        return "redirect:query";
    }

    @GetMapping("playball/logout")
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:login";
    }
}