package tao.oscra;

import org.springframework.data.repository.CrudRepository;
import tao.object.oscra.TestUserEntity;

import java.util.List;

/**
 * Created by xinrui on 26/02/17.
 */
public interface OscraUserRepository extends CrudRepository<TestUserEntity, Long> {
    List<TestUserEntity> findAll();
}
