package Menu;

import model.Admin;

public class AdminMenuImpl implements MainI<Admin> {


    @Override
    public void showMainMenu(Admin admin) {
        System.out.println("AdminMenu");
    }


}
