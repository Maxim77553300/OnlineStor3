package Menu;

import java.util.Scanner;

public class InputDataUtil {




    public static String inputDataMethod() {

        boolean flag = true;
        String a = null;
        try (Scanner scanner = new Scanner(System.in)){



            while (flag == true && scanner.hasNext()){
                a = scanner.nextLine();
                switch (a){
                    case "1" :
                        System.out.println("Main menu");
                        MainI mainI = new DefaultMainMenuImpl();
                        mainI.showMainMenu();
                        break;
                    case "2" :
                        System.out.println("Show goods");
                        break;
                    case "3" :
                        System.out.println("Log in ");

                        break;
                    case "4" :
                        System.out.println("Exit");
                        flag = false;
                        break;
                    default:
                        System.out.println("Input Error");
                        break;
                }
            }

            return a;    }
    }
}
