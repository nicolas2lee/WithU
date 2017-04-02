package tao.withu.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tao.withu.UserService;
import tao.withu.withu.object.UserEntity;
import tao.withu.withu.repository.UserRepository;

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
        List<UserEntity> userEntityList = new ArrayList<UserEntity>();
        userRepository.findAll().iterator().forEachRemaining(userEntityList::add);
        return userEntityList;
    }
}
