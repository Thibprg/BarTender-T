package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class Order {
    int table;
    Drink drink_list;

    public Order(int table, Drink drink_list) {
        this.table = table;
        this.drink_list = drink_list;
    }

    /*
     *  getters et setters
     */
    public int getTable() {
        return table;
    }
    public void setTable(int table) {
        this.table = table;
    }
    public Drink getDrink_list() {
        return drink_list;
    }
    public void setDrink_list(Drink drink_list) {
        this.drink_list = drink_list;
    }

    /*
     * methodes de la classe Order
     */
    public void add(Object drink, int amount)
    {}
    public void delete(Object drink)
    {}
    public void update(Object drink, int new_amount)
    {}
    public void close()
    {}
}
