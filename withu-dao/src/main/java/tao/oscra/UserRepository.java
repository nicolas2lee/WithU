package tao.oscra;

import org.springframework.data.repository.CrudRepository;
import tao.object.oscra.UserEntity;

import java.util.List;

/**
 * Created by xinrui on 26/02/17.
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    List<UserEntity> findAll();
}
