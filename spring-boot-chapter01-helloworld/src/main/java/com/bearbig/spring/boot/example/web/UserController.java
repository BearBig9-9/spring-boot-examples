package com.bearbig.spring.boot.example.web;

import com.bearbig.spring.boot.example.domain.entity.User;
import com.bearbig.spring.boot.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.boot.example.web 2017/2/5 09:36 xiongyu $
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(@RequestParam String id){
        User user = userService.findUserById(id);
        if(user != null){
            return user.getName();
        }
        return "无此用户！";
    }
}
