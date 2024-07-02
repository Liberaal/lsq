package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.system.domain.User;
import com.ruoyi.system.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserMapper userMapper;

    @Anonymous
    @PostMapping("/login")
    @ResponseBody
    public List<User> getUser(@RequestParam String Name,@RequestParam String Password){
        return userMapper.loginIt(Name,Password);
    }

    @Anonymous
    @PostMapping("/register")
    @ResponseBody
    public Boolean setUser(@RequestParam String Name,@RequestParam String Password,@RequestParam String Role){
        return userMapper.insertUser(Name,Password,Role);
    }
}
