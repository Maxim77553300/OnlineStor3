package Menu;

import java.util.Scanner;

public interface MainMenuable extends InputAble, StartAble,Mainable {

    default void startMethod() {
        System.out.println("MenuAble");
    }

    String inputDataMethod();



    void showMainMenu();


}
