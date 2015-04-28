package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class Waiter extends  User{
    String username;
    String password;


    public Waiter(String username, String password) {
        super(username, password);
    }

    /*
     * methodes de la classe Waiter
     */
    private Order initOrder(int table_num)
    {
        Drink dr = new Drink('1',0,0,0,0,0,0.0,0.0,"000","000","000","icon");
        Order com1 = new Order(1, dr);
        return com1;
    }
    private Bill initBill(int table_num)
    {
        Bill bill1 = new Bill(3,20.0);
        return bill1;
    }

}