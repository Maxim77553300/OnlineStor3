package Menu;

import db.PhoneRepository;
import db.Repository;
import model.User;
import services.CheckLoginI;
import services.CheckLoginImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class InputDataUtil {




    public static String inputDataMethod() {
        CheckLoginI checkLoginI = new CheckLoginImpl();
        boolean flag = true;
        String a = null;
        try (Scanner scanner = new Scanner(System.in)){



            while (flag == true && scanner.hasNext()){
                a = scanner.nextLine();
                switch (a){
                    case "1" :
                        System.out.println("Main menu");
                        MainI mainI = new DefaultMainMenuImpl();
                        mainI.showMainMenu(new Object());
                        break;
                    case "2" :
                        System.out.println("Show goods");
                        Repository repository = new PhoneRepository();
                        try {
                            System.out.println(repository.findAll());
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }
                        break;
                    case "3" :
                        System.out.println("Log in - press 1");
                        System.out.println("Create new account - press 2");
                        String l = scanner.nextLine();
                        if(l.equals("2")){
                            System.out.println("Enter your login please :");
                            String login = scanner.nextLine();
                            System.out.println("Enter your password :");
                            String pass = scanner.nextLine();
                            checkLoginI.createAccount(login,pass);
                        } else if (l.equals("1")) {
                            System.out.println("Enter your login please :");
                            String login = scanner.nextLine();
                            System.out.println("Enter your password :");
                            String pass = scanner.nextLine();

                            checkLoginI.checkLogin(login, pass);
                        } else {
                            System.out.println("Error - please enter right number!");
                        }
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
