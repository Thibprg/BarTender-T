package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    /*
     *  getters et setters
     */
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    /*
     * methodes de la classe User
     */
    public User logIn()
    {
        User louis = new User("louis","0000");
        return  louis;
    }
    public void logOut()
    {}
    private void setLanguage()
    {}
    public MenuDisplayer initMenuDisplayer()
    {
        User louis = new User("louis","0000");
        MenuDisplayer menu1 = new MenuDisplayer(1,1,0.0,0.0,0.0,0.0,"hi","hello","hi",louis);
        return menu1;
    }
}
