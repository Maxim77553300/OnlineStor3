package db;

import model.Phone;
import model.User;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Repository<User> {

    public static final String SELECT_PHONES = "SELECT * FROM shop1.phones;";
    public static final String SELECT_USERS = "SELECT * FROM shop1.users;";
    public static final String INSERT_USER = "INSERT INTO users (name,password_hash,is_admin) VALUES (?,?,?)";


    @SneakyThrows
    @Override
    public void add(User entity) {
        PreparedStatement ps = getConnection().prepareStatement(INSERT_USER);
        ps.setString(1, entity.getName());
        ps.setString(2, entity.getPassword());
        ps.setInt(3, entity.getX());
        ps.execute();

    }



    @SneakyThrows
    @Override
    public List<User> findAll() {

        PreparedStatement ps = getConnection().prepareStatement(SELECT_USERS);
        ResultSet resultSet = ps.executeQuery();
        List<User> list = new ArrayList<>();


        while (resultSet.next()) {
            boolean isAdmin = false;
            Integer id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String password = resultSet.getString("password_hash");
            Integer isA = resultSet.getInt("is_admin");
            if(isA == 0){
                isAdmin = true;
            }

            //System.out.println(id + name + password);
            list.add(new User(name,password,isAdmin));
            isAdmin = false;
        }


        return list;
    }




    @SneakyThrows
    private Connection getConnection() {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/shop1", "root", "77553300");

    }


}
