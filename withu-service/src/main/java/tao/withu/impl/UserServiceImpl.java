package tao.withu.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tao.withu.UserService;
import tao.withu.object.UserEntity;
import tao.withu.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinrui on 15/03/17.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    public UserEntity addUser(UserEntity UserEntity) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(UserEntity.getUsername());
        return userRepository.save(userEntity);
    }

    public List<UserEntity> findAll() {
        List<UserEntity> userEntityList = new ArrayList<>();
        //return userRepository.findAll();
        System.out.println("========= before print ============");
        userRepository.findAll().iterator().forEachRemaining(userEntityList::add);
        System.out.println("========= after print ============");
        //System.out.println(userEntityList);
        return userEntityList;
    }
}
