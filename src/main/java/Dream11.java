import model.User;
import service.Auth;
import service.MainMenu;
import utils.EventUtil;
import utils.UsersUtils;

public class Dream11 {

    public static void main(String[] args) {
        UsersUtils usersUtils = new UsersUtils();

        Auth auth = new Auth(usersUtils);
        auth.printMenu();

        EventUtil eventUtil = new EventUtil();
        eventUtil.loadEvent();
        User loggedIUnUser = usersUtils.getLoggedInUser();
        MainMenu mainMenu = new MainMenu(auth, eventUtil, loggedIUnUser);
        mainMenu.printMainMenu();
    }


}

