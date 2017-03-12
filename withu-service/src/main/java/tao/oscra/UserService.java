package tao.oscra;

import tao.object.oscra.UserEntity;

import java.util.List;

/**
 * Created by xinrui on 26/02/17.
 */
public interface UserService {
     List<UserEntity> findAll();
}
