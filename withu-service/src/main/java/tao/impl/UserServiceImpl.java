package tao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tao.UserService;
import tao.object.result.UserEntityResult;
import tao.oscra.impl.OscraUserServiceImpl;
import tao.withu.impl.WithuUserServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinrui on 15/03/17.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    OscraUserServiceImpl oscraUserServiceImpl;

    @Autowired
    WithuUserServiceImpl withuUserServiceImpl;

    public List<UserEntityResult> addUser(UserEntityResult userEntityResult) {
        UserEntityResult oscraUser = oscraUserServiceImpl.addUser(userEntityResult);
        UserEntityResult withuUser = withuUserServiceImpl.addUser(userEntityResult);
        List<UserEntityResult> users = new ArrayList<UserEntityResult>();
        users.add(oscraUser);
        users.add(withuUser);
        return users;
    }
}
