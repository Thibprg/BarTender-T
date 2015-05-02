package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class Waiter extends  User{
    String username;
    String password;
    boolean isLog;

    public Waiter(String username, String password) {
        super(username, password);
    }

    /*
     * methodes de la classe Waiter
     */

    /*
     *  initialisie une commande si le waiter est bien log, et retourne null sinon
     */
    private Order initOrder(int table_num)
    {
        if (this.isLog) {
            Drink dr = new Drink('0', 0, 0, 0, 0, 0, 0.0, 0.0, EMPTY, EMPTY, EMPTY, "icon");
            Drink dr_liste [] = new Drink[1];
            Order com1 = new Order(1, dr_liste);
            return com1;
        }
        else {
            return null;
        }
    }
    /*
     *  initialise un addition si le waiter est bien log et null sinon
     */
    private Bill initBill(int table_num)
    {
        if(this.isLog) {
            Bill bill1 = new Bill(3, 20.0);
            return bill1;
        }
        else {
            return null;
        }
    }
}