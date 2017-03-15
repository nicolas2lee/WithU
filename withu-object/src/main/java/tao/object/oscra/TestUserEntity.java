package tao.object.oscra;

import javax.persistence.*;

@Entity
@Table(name = "User", schema = "oscra")
@IdClass(TestUserEntityPk.class)
public class TestUserEntity {
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