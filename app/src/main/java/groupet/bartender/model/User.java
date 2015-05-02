package groupet.bartender.model;

import groupet.bartender.activity.LoginActivity;

/**
 * Created by jacquesth on 26/04/15.
 */
public class User {
    public static final String EMPTY = "";
    String username;
    String password;
    boolean isLog = false;  //booleen permettant de savoir si le user est connecté ou pas

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

    /*
     *  crée un nouveau userame et password valide entre eux
     */
    public User createLogIn(String newUsername, String newPassword)
    {
        User newUser = new User(newUsername,newPassword);
        return  newUser;
    }
    /*
     *  retourne le user logger si le logging et le password existe et sont mutuellement valide et null sinon
     */
    public User logIn(String username, String password)
    {
        if (LoginActivity.userOk(username, password) == true) {     // faut une méthode public userOk dans LoginActivity
            User userLog = LoginActivity.getUserLog();
            userLog.isLog = true;
            return userLog;                                         // faut une méthode public getUserLog dans LoginActivity
        }
        else {
            return null;
        }
    }
    /*
     *  logOut un user en mettant son booleen siLog a false
     */
    public void logOut(User userWantLogOut)
    {
        userWantLogOut.isLog = false;
    }
    /*
     * change la langue d'utilisation
     */
    private void setLanguage()
    {}
    /*
     * retourne un menu initialisé le user est bien log, et null sinon
     */
    public MenuDisplayer initMenuDisplayer()
    {
        if (this.isLog == true) {
            User louis = new User("louis", "0000");
            MenuDisplayer menu1 = new MenuDisplayer(0, 0, 0.0, 0.0, 0.0, 0.0, EMPTY, EMPTY, EMPTY, louis);
            return menu1;
        }
        else {
            return null;
        }
    }
}
