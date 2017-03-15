package tao.withu.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tao.object.result.UserEntityResult;
import tao.object.withu.TestUserEntity;
import tao.withu.WithuUserRepository;

/**
 * Created by xinrui on 15/03/17.
 */
@Service
@Transactional
public class WithuUserServiceImpl {
    @Autowired
    WithuUserRepository withuUserRepository;

    public UserEntityResult addUser(UserEntityResult userEntityResult) {
        TestUserEntity testUserEntity = new TestUserEntity();
        testUserEntity.setUsername(userEntityResult.getUsername());
        testUserEntity.setId(userEntityResult.getId());
        TestUserEntity testUserEntity1 = withuUserRepository.save(testUserEntity);
        UserEntityResult userEntityResult1 = new UserEntityResult();
        userEntityResult1.setUsername(testUserEntity1.getUsername());
        return userEntityResult1;
    }
}
