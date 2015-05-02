package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class Bill {
    int table;
    double total;

    public Bill(int table, double total) {
        this.table = table;
        this.total = total;
    }

    /*
     * Getters et setters
     */
    public int getTable() {
        return table;
    }
    public void setTable(int table) {
        this.table = table;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    //toString
    public String toString() {
        return "addition de la table n°" + table + ",           total=" + total +'}';
    }

    /*
         * Methodes de la classe Bill
         */
    public void print()
    {}
    public void close()
    {}
}
