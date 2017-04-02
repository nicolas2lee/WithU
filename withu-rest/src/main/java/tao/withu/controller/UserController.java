package tao.withu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tao.withu.UserService;
import tao.withu.object.UserEntity;

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
    public List<UserEntity> all(){

        List<UserEntity> result = userService.findAll();
        System.out.println("========= controller ============");
        return result;
    }

    @RequestMapping(value = "/add", method= RequestMethod.POST)
    public UserEntity add(@RequestBody UserEntity userEntity){
        return userService.addUser(userEntity);
    }

}
