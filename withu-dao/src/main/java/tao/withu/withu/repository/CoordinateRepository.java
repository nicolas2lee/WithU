package tao.withu.withu.repository;

import org.springframework.data.repository.CrudRepository;
import tao.withu.withu.object.CoordinateEntity;

import java.util.List;

/**
 * Created by xinrui on 12/03/17.
 */
public interface CoordinateRepository extends CrudRepository<CoordinateEntity, Long> {
    List<CoordinateEntity> findAll();
}
