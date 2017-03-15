package tao;

import tao.object.result.UserEntityResult;

import java.util.List;

/**
 * Created by xinrui on 15/03/17.
 */
public interface UserService {
    List<UserEntityResult> addUser(UserEntityResult userEntityResult);
}
