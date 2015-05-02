package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class Customer extends User{
    String username;
    String password;
    boolean isLog;

    public Customer(String username, String password) {
        super(username,password);
    }

    /*
     *  methode de la classe Customer
     */

    /*
     *  ajoute l'avis (note et/ou commantaire) d'un client a un boisson si le client est log et print un message sinon
     */
    public void addAvis(int note, String comment, Drink drink)
    {
        if(this.isLog) {
            drink.newAverage(note);
            drink.addComment(comment);
        }
        else {
            System.out.println("Vous n'êtes pas connecté à l'application");
        }
    }
}
