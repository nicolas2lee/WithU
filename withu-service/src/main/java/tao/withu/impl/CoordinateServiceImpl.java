package tao.withu.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tao.withu.CoordinateService;
import tao.object.withu.CoordinateEntity;
import tao.withu.CoordinateRepository;

import java.util.List;

/**
 * Created by xinrui on 12/03/17.
 */
@Service
@Transactional
public class CoordinateServiceImpl implements CoordinateService{
    @Autowired
    CoordinateRepository coordinateRepository;

    public List<CoordinateEntity> findAll() {
        return coordinateRepository.findAll();
    }
}
