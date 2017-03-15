package tao.object.withu;

import javax.persistence.*;

/**
 * Created by xinrui on 15/03/17.
 */
@Entity
@Table(name = "User", schema = "withu")
@IdClass(TestUserEntityPk.class)
public class TestUserEntity {
    @Id
    private Long id;
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
