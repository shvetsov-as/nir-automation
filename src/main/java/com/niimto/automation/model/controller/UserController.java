package com.niimto.automation.model.controller;

import com.niimto.automation.entity.user.dto.UserDtoRequest;
import com.niimto.automation.model.facade.userfacade.UserFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserFacade userFacade;

    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @GetMapping()
    public String newUserForm(Model model) {
        model.addAttribute("userDtoRequest", new UserDtoRequest());
        return "user-create-form";
    }

    @PostMapping()
    public String createUser(@ModelAttribute("userDtoRequest") UserDtoRequest request) {
        userFacade.createUser(request);
        return "redirect:admin";
    }

//    @ModelAttribute("userDtoRequest")
//    public UserDtoRequest userDtoRequest() {
//        return new UserDtoRequest();
//    }

}
