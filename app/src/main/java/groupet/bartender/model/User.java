package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class User {
    String username;
    String password;

    /*
     * methodes de la classe User
     */
    public User logIn()
    {
        User louis = new User();
        return  louis;
    }
    public void logOut()
    {}
    private void setLanguage()
    {}
    public MenuDisplayer initMenuDisplayer()
    {
        MenuDisplayer menu1 = new MenuDisplayer();
        return menu1;
    }
}
