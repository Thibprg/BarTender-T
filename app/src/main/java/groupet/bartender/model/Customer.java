package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class Customer extends User{
    String username;
    String password;

    public Customer(String username, String password) {
        super();
    }
    /*
     * getters et setters
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
     *  methode de la classe Customer
     */
    public void addAvis(int note, String comment, Object drink)
    {}
}
