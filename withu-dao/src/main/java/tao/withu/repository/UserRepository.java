package tao.withu.repository;

import org.springframework.data.repository.CrudRepository;
import tao.withu.object.UserEntity;

/**
 * Created by xinrui on 15/03/17.
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
