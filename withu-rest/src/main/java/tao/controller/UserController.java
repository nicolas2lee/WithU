package tao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tao.UserService;
import tao.impl.UserServiceImpl;
import tao.object.result.UserEntityResult;

import java.util.List;


/**
 * Created by xinrui on 15/03/17.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method= RequestMethod.GET)
    public List<UserEntityResult> all(){
        //return userService.findAll();
        return null;
    }

    @RequestMapping(value = "/add", method= RequestMethod.POST)
    public List<UserEntityResult> add(@RequestBody UserEntityResult userEntityResult){
        //return userService.findAll();
        return userService.addUser(userEntityResult);
        //return null;
    }

}
