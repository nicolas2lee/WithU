package tao.controller.oscra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tao.oscra.UserService;
import tao.object.oscra.UserEntity;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController{

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method= RequestMethod.GET)
    public List<UserEntity> all(){
        return userService.findAll();
    }
}