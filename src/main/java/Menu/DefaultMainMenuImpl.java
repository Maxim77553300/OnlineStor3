package Menu;

import model.User;

public class DefaultMainMenuImpl implements MainI<Object> {



    @Override
    public void showMainMenu(Object user) {

        System.out.println("DefaultMenu");


        System.out.println("Hello, you are on the Best site of Belarus!! Make your choice,please!!");
        System.out.println("You are in Main menu");
        System.out.println("1 - Main menu ");
        System.out.println("2 - Show goods");
        System.out.println("3 - Log in/create new account");
        System.out.println("4 - Exit");
        InputDataUtil.inputDataMethod();
    }
}
