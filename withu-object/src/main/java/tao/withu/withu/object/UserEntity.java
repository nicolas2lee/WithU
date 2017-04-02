package tao.withu.withu.object;

import tao.withu.withu.object.common.AbstractEntity;

import javax.persistence.*;

/**
 * Created by xinrui on 15/03/17.
 */
@Entity
@Table(name = "User", schema = "withu")
@IdClass(UserEntityPk.class)
public class UserEntity extends AbstractEntity {

    @Id
    private String username;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
