package tao.oscra.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tao.object.oscra.TestUserEntity;
import tao.object.result.UserEntityResult;
import tao.oscra.OscraUserRepository;

/**
 * Created by xinrui on 26/02/17.
 */
@Service
@Transactional
public class OscraUserServiceImpl {

    /*
    @Autowired
    OscraUserRepository userRepository;

    public List<TestUserEntity> findAll() {
        return userRepository.findAll();
    }
*/
    @Autowired
    OscraUserRepository oscraUserRepository;

    public UserEntityResult addUser(UserEntityResult userEntityResult) {
        TestUserEntity testUserEntity = new TestUserEntity();
        testUserEntity.setUsername(userEntityResult.getUsername());
        testUserEntity.setId(userEntityResult.getId());
        TestUserEntity testUserEntity1 = oscraUserRepository.save(testUserEntity);
        UserEntityResult userEntityResult1 = new UserEntityResult();
        userEntityResult1.setUsername(testUserEntity1.getUsername());
        return userEntityResult1;
    }
}
