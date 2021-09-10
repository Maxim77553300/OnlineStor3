package main;

import Menu.*;
import db.PhoneRepository;
import db.Repository;
import db.UserRepository;
import model.Phone;
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

//        StartAble startAble = new StartImpl();
//        startAble.startMethod();



        Repository<Phone> repository = new PhoneRepository();
   //     Phone phone1 = new Phone("Nokia111",125);
        Phone phone2 = new Phone("Nokia111",125,1);
//        Phone phone3 = new Phone("Nokia111",125);
//        Phone phone4 = new Phone("Nokia111",125);
        System.out.println(repository.findAll());
//        repository.add(phone1);
//        repository.add(phone2);
//        repository.add(phone3);
//        repository.add(phone4);

        repository.delete(phone2);
//
        System.out.println(repository.findAll());

    }


}
