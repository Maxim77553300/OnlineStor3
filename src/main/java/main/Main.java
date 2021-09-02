package main;

import Menu.*;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

   //  ConnectionSQL.connectionSQL();

        Mainable mainMenu = new AdminMenuImpl();
        mainMenu.showMainMenu();

        Mainable mainable1 = new UserMenuImpl();
        mainable1.showMainMenu();

        Mainable mainable2 = new DefaultMainMenuImpl();
        mainable2.showMainMenu();




    }


}
