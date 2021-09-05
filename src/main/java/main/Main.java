package main;

import Menu.*;
import db.Repository;
import db.UserRepository;
import model.User;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //  ConnectionSQL.connectionSQL();

//        Mainable mainMenu = new AdminMenuImpl();
//        mainMenu.showMainMenu();

//        Mainable mainable1 = new UserMenuImpl();
//        mainable1.showMainMenu();



//        Mainable mainable2 = new DefaultMainMenuImpl();
//        mainable2.showMainMenu();


//        Repository<User> repository = new UserRepository();
//        repository.add(new User("Max","111",false) );
//        System.out.println(repository.findAll());

        StartAble startAble = new StartImpl();
        startAble.startMethod();



    }


}
