package tao.withu;

import org.springframework.data.repository.CrudRepository;
import tao.object.withu.TestUserEntity;

/**
 * Created by xinrui on 15/03/17.
 */
public interface WithuUserRepository extends CrudRepository<TestUserEntity, Long> {
}
