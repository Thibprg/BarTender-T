package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class Drink extends Object{
    char name;
    int id;
    int numbersOfVotes;
    int availableQuantity;
    int volume;
    int stockMax;
    int threshold;
    double price;
    double average;
    String description;
    String category;
    String subCategory;
    Object icon;

    public Drink(char name, int id, int availableQuantity, int volume, int stockMax, int threshold, double price, double average, String description, String category, String subCategory, Object icon) {
        this.name = name;
        this.id = id;
        this.availableQuantity = availableQuantity;
        this.volume = volume;
        this.stockMax = stockMax;
        this.threshold = threshold;
        this.price = price;
        this.average = average;
        this.description = description;
        this.category = category;
        this.subCategory = subCategory;
        this.icon = icon;
    }


   /*
    * getters et setters
    */
    public char getName() {
        return name;
    }
    public void setName(char name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getStockMax() {
        return stockMax;
    }
    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }
    public int getThreshold() {
        return threshold;
    }
    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAverage(double average) {
        this.average = average;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getSubCategory() {
        return subCategory;
    }
    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }
    public Object getIcon() {
        return icon;
    }
    public void setIcon(Object icon) {
        this.icon = icon;
    }

    /*
     * methode de Drink
     */

    /*
     * calcule un nouvelle moyenne a la boisson en fonction de la nouvelle note donnée.
     */
    public void newAverage(int vote) {
        double newAverage = (((this.average)*((double) numbersOfVotes)) + (double) vote) / ((double) numbersOfVotes+1.0);
    }
    /*
     * ajoute l'avis a la suite de celle de la boisson
     */
    public void addComment(String newComment) {
        //TODO louis
    }
}