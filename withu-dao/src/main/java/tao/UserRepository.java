package tao;

import org.springframework.data.repository.CrudRepository;
import tao.object.UserEntity;

import java.util.List;

/**
 * Created by xinrui on 26/02/17.
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    List<UserEntity> findAll();
}
