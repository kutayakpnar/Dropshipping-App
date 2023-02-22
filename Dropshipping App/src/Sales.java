public class Sales {
    private String salesId;
    private Customer customer;
    private Product product;
    private String salesDate;

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    private double salesPrice;

    public Sales(String salesId,Customer customer,Product product,String salesDate){
        this.salesId=salesId;
        this.customer=customer;
        this.product=product;
        this.salesDate=salesDate;
        this.salesPrice=this.product.getPrice()+(((this.product.getRate()/5)*100)*this.product.getNumOfRew());
    }


}
