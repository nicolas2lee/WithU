package tao;

import tao.object.UserEntity;

import java.util.List;

/**
 * Created by xinrui on 26/02/17.
 */
public interface UserService {
     List<UserEntity> findAll();
}
