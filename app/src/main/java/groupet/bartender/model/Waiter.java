package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class Waiter extends  User{
    String username;
    String password;


    /*
     * methodes de la classe Waiter
     */
    private Order initOrder(int table_num)
    {
        Order com1 = new Order();
        return com1;
    }
    private Bill initBill(int table_num)
    {
        Bill bill1 = new Bill(3,20.0);
        return bill1;
    }

}