package tao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tao.UserRepository;
import tao.UserService;
import tao.object.UserEntity;

import java.util.List;

/**
 * Created by xinrui on 26/02/17.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }
}
