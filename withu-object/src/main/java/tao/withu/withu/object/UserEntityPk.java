package tao.withu.withu.object;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by xinrui on 15/03/17.
 */
public class UserEntityPk implements Serializable{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntityPk that = (UserEntityPk) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return username != null ? username.equals(that.username) : that.username == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
