package Menu;

import java.util.Scanner;

public class ScannerUtil implements InputAble{



    @Override
    public String inputDataMethod() {
        try (Scanner scanner = new Scanner(System.in)){

            String a = scanner.nextLine();
            return a;    }
    }
}
