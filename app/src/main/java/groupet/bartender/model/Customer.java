package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class Customer extends User{
    String username;
    String password;

    public Customer(String username, String password) {
        super(username,password);
    }

    /*
     *  methode de la classe Customer
     */
    public void addAvis(int note, String comment, Object drink)
    {}
}
