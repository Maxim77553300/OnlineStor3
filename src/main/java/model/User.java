package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String password;
    private boolean isAdmin;

    public int getX() {
        return isAdmin() ? 0 : 1;
    }


}
