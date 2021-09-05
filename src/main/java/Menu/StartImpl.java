package Menu;

import java.util.Scanner;

public class StartImpl implements StartAble {

    @Override
    public void startMethod() {
        System.out.println("Start");

        MainI mainable2 = new DefaultMainMenuImpl();
        mainable2.showMainMenu();
        InputDataUtil.inputDataMethod();

        // логика по выбору

    }

    public void choice() {


        boolean flag = true;

        try (Scanner scanner = new Scanner(System.in)) {

            while (flag == true && scanner.hasNext()) {

                String number = scanner.nextLine();


                switch (number) {
                    case "1":
                        System.out.println("Main menu");

                        break;
                    case "2":
                        System.out.println("Show goods");

                        break;
                    case "3":
                        System.out.println("Log in");

                        break;
                    case "4":
                        System.out.println("Exit");
                        scanner.close();
                        flag = false;

                        break;
                    default:
                        System.out.println("Error user");
                        break;
                }
            }
        }
    }




}
