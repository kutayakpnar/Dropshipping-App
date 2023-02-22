public class Product {
    private String productID;
    private String title;
    private double rate;
    private double numOfRew;
    private double price;

    public Product(String productID,String title,double rate,double numOfRew,double price){
        this.productID=productID;
        this.title=title;
        this.rate=rate;
        this.numOfRew=numOfRew;
        this.price=price;

    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getNumOfRew() {
        return numOfRew;
    }

    public void setNumOfRew(double numOfRew) {
        this.numOfRew = numOfRew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }





}
