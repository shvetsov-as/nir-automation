package com.niimto.automation.model.controller;

import com.niimto.automation.entity.user.dto.UserDtoRequest;
import com.niimto.automation.model.service.UserService;
import com.niimto.automation.model.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    private final PersonDAO personDAO;

    public UserController(UserServiceImpl userService, PersonDAO personDAO) {
        this.userService = userService;
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String newUserForm(Model model) {
        model.addAttribute("userDtoRequest", new UserDtoRequest());
        return "user-create-form";
    }

    @PostMapping()
    public String createUser(@ModelAttribute("userDtoRequest") UserDtoRequest request) {
        personDAO.save(request);
        System.out.println("**************" + request);
        userService.createUser(request);

        return "redirect:admin";
    }

//    @ModelAttribute("userDtoRequest")
//    public UserDtoRequest userDtoRequest() {
//        return new UserDtoRequest();
//    }

}
