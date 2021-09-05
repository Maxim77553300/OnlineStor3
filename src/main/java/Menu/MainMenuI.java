package Menu;

public interface MainMenuI extends StartAble, MainI {

    default void startMethod() {
        System.out.println("MenuInterface");
    }




    void showMainMenu();


}
