package db;

import lombok.SneakyThrows;
import model.Phone;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneRepository implements Repository<Phone> {

    private static String SELECT_PHONES = "SELECT * FROM shop1.phones;";
    private static String INSERT_PHONES = "INSERT INTO shop1.phones (name,price,number) VALUES (?,?,?);";
    private static String GET_ID = "SELECT id FROM shop1.phones WHERE name = '?' ;";
    private static String GET_NUMBER_PHONE = "SELECT number FROM shop1.phones WHERE id = ? ";
    private static String DELETE_PHONES = "UPDATE shop1.phones SET number = ? WHERE id = ? ";


    @Override
    public void add(Phone entity) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement(INSERT_PHONES);
        ps.setString(1, entity.getName());
        ps.setInt(2, entity.getPrice());
        ps.setInt(3, entity.getNumber());
        ps.execute();

    }

    @Override
    public List findAll() throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement(SELECT_PHONES);
        ResultSet resultSet = ps.executeQuery();
        ArrayList<Phone> list = new ArrayList<>();

        while (resultSet.next()) {

            String name = resultSet.getString("name");
            Integer price = resultSet.getInt("price");
            Integer number = resultSet.getInt("number");

            list.add(new Phone(name, price, number));
        }


        return list;
    }

    @SneakyThrows
    public Integer getId(Phone phone) {
        PreparedStatement ps1 = getConnection().prepareStatement(GET_ID);
        ps1.setString(1, phone.getName());
        ResultSet resultSet = ps1.executeQuery();
        Integer id = resultSet.getInt("id");
        return id;
    }

    @SneakyThrows
    public Integer getNumberPhones(Phone phone){
        PreparedStatement ps = getConnection().prepareStatement(GET_NUMBER_PHONE);
        ps.setInt(1,getId(phone));
        ResultSet resultSet = ps.executeQuery();
        Integer number = resultSet.getInt("number");
        return number;
    }


    @SneakyThrows
    @Override
    public void delete(Phone phone) {


        Integer id = getId(phone);
        Integer number = getNumberPhones(phone);

        PreparedStatement ps2 = getConnection().prepareStatement(DELETE_PHONES);
        ps2.setInt(1, (number - 1));
        ps2.setInt(2, id);
        ps2.execute();

    }


    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/shop1", "root", "77553300");
    }
}
