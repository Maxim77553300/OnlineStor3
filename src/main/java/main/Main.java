package main;

import Entity.Admin;
import Menu.*;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

   //  ConnectionSQL.connectionSQL();

        Mainable mainMenu = new MainMenuImpl();
        mainMenu.showMainMenu((Mainable) new Admin("ggg","111"));




    }


}
