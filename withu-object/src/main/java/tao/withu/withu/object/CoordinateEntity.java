package tao.withu.withu.object;

import tao.withu.withu.object.common.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by xinrui on 12/03/17.
 */
@Entity
@Table(name = "Coordinate", schema = "withudev")
public class CoordinateEntity extends AbstractEntity {

    private Double longitude;
    private Double latitude;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

}
