package services;

import Menu.AdminMenuImpl;
import Menu.MainI;
import Menu.MainMenuImpl;
import db.PhoneRepository;
import db.Repository;
import db.UserRepository;
import model.Admin;
import model.User;

import javax.naming.Name;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckLoginImpl implements CheckLoginI {
    private static final String ADMIN = "admin";
    private static final String PASS = "111";
    UserRepository userRepository = new UserRepository();
    List<User> list = userRepository.findAll();
    List<String> listName = new ArrayList<>();


    @Override
    public void checkLogin(String login, String password) {

        fullListName();






        if (login.equals(ADMIN) && password.equals(PASS)) {

            System.out.println("You enter as Admin ! Hello admin!");
            Admin admin = new Admin(ADMIN, PASS);
            MainI mainI = new MainMenuImpl();
            mainI.showMainMenu(admin);

        } else if (listName.contains(login)) {

            System.out.println("Welcome Dear " + login + " You are in your account!");
            System.out.println("Show goods");
            Repository repository = new PhoneRepository();
            try {
                System.out.println(repository.findAll());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {

            userRepository.add(new User(login, password, false));

            System.out.println("You enter into the shop successfully ! ");
        }
    }

    @Override
    public void createAccount(String login, String password) {

        fullListName();

        if(listName.contains(login)){
            System.out.println("Error!! This login is used in shop, please choose another login");
        } else {
        userRepository.add(new User(login,password,false));}
    }

    private void fullListName(){
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            listName.add(i, name);
        }
    }
}
