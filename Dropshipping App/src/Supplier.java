public class Supplier {
    private Product[] products;

    public Supplier(){
        products=new Product[100];
    }
    public void printProducts(){
        for(int i=0;i<this.products.length;i++){
            if(products[i]!=null){
                System.out.println(products[i].getProductID());
            }
        }
    }


    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
