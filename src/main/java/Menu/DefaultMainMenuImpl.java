package Menu;

public class DefaultMainMenuImpl implements MainI {



    @Override
    public void showMainMenu() {

        System.out.println("DefaultMenu");


        System.out.println("Hello, you are on the Best site of Belarus!! Make your choice,please!!");
        System.out.println("You are in Main menu");
        System.out.println("1 - Main menu ");
        System.out.println("2 - Show goods");
        System.out.println("3 - Log in");
        System.out.println("4 - Exit");
        InputDataUtil.inputDataMethod();
    }
}
