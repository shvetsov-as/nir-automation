package com.niimto.automation.model.controller;

import com.niimto.automation.model.facade.userfacade.UserFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final UserFacade userFacade;

    public AdminController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }
    @GetMapping()
    public String index(Model model) {
        model.addAttribute("userDtoResponseList", userFacade.findAll());
        return "admin-main";
    }
}
