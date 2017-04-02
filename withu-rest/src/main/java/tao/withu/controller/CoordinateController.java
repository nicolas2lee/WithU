package tao.withu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tao.withu.CoordinateService;
import tao.withu.object.CoordinateEntity;

import java.util.List;

/**
 * Created by xinrui on 12/03/17.
 */
@RestController
@RequestMapping("/coordinates")
public class CoordinateController {
    @Autowired
    private CoordinateService coordinateService;

    @RequestMapping(value = "/all", method= RequestMethod.GET)
    public List<CoordinateEntity> all(){
        return coordinateService.findAll();
    }
}
