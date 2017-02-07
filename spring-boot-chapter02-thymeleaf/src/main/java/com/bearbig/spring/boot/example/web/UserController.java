package com.bearbig.spring.boot.example.web;

import com.bearbig.spring.boot.example.domain.entity.User;
import com.bearbig.spring.boot.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.boot.example.web 2017/2/5 09:36 xiongyu $
 */

// 注意此处是@Controller, 而不是@RestController
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(@RequestParam String id, Model model){
        User user = userService.findUserById(id);
        if(user != null){
            model.addAttribute("user", user);
        }
        return "index";
    }
}
