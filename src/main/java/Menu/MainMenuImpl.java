package Menu;

public class MainMenuImpl implements MainMenuable{
    @Override
    public String inputDataMethod() {
        InputAble inputAble = new ScannerUtil();

        return inputAble.toString();
    }

    @Override
    public void showMainMenu() {

    }

    @Override
    public void showMainMenu(Mainable mainable) {

     mainable.showMainMenu(mainable);
    }
}
