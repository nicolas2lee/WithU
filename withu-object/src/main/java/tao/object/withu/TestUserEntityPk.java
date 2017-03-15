package tao.object.withu;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by xinrui on 15/03/17.
 */
public class TestUserEntityPk implements Serializable{
    @Id
    private Long id;
    @Id
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
