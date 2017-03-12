package tao.oscra.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tao.oscra.UserRepository;
import tao.oscra.UserService;
import tao.object.oscra.UserEntity;

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
