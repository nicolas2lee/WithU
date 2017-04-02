package tao.withu;

import tao.withu.object.UserEntity;

import java.util.List;

/**
 * Created by xinrui on 15/03/17.
 */
public interface UserService {
    UserEntity addUser(UserEntity userEntityResult);

    List<UserEntity> findAll();
}
