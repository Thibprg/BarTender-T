package groupet.bartender.model;

/**
 * Created by jacquesth on 26/04/15.
 */
public class MenuDisplayer {
    int minVol;
    int maxVol;
    double minPrice;
    double maxPrice;
    double minNote;
    double maxNote;
    String category;
    String subCategory;
    String keyword;
    User userType;
    Drink drink;

    public MenuDisplayer(int minVol, int maxVol, double minPrice, double maxPrice, double minNote, double maxNote, String category, String subCategory, String keyword, User userType) {
        this.minVol = minVol;
        this.maxVol = maxVol;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.minNote = minNote;
        this.maxNote = maxNote;
        this.category = category;
        this.subCategory = subCategory;
        this.keyword = keyword;
        this.userType = userType;
    }

    /*
     * getters et setters
     */
    public int getMinVol() {
        return minVol;
    }
    public void setMinVol(int minVol) {
        this.minVol = minVol;
    }
    public int getMaxVol() {
        return maxVol;
    }
    public void setMaxVol(int maxVol) {
        this.maxVol = maxVol;
    }
    public double getMinPrice() {
        return minPrice;
    }
    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }
    public double getMaxPrice() {
        return maxPrice;
    }
    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
    public double getMinNote() {
        return minNote;
    }
    public void setMinNote(double minNote) {
        this.minNote = minNote;
    }
    public double getMaxNote() {
        return maxNote;
    }
    public void setMaxNote(double maxNote) {
        this.maxNote = maxNote;
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
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public User getUserType() {
        return userType;
    }
    public void setUserType(User userType) {
        this.userType = userType;
    }

    /*
     * methodes de la classe Drink
     */
    public void display()
    {}
    public void search()
    {}
}
