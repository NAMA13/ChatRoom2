package com.chat.room.Controller;

import com.chat.room.Model.User;
import com.chat.room.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;


    @GetMapping(path = "/create-account")
    //@PreAuthorize(value = "hasAuthority('student:add')")
    public String showSavePage(Model model) {
        User user = new User();

        model.addAttribute("user", user);

        return "create-account";
    }

//    @PostMapping(path = "/save")
//    //@PreAuthorize(value = "hasAuthority('student:save')")

    public String save(@Valid @ModelAttribute(name = "user") User user, BindingResult br) {


        if(br.hasErrors()) {
            return "create-account";
        }
        service.save(user);
        return "redirect:/login";
    }
}
