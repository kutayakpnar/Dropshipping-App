import javax.swing.plaf.IconUIResource;

public class SalesQuery {

    public void mostProfitProduct(Sales[][] sales) {
        String name = null;
        String id=null;
        double profit = sales[0][0].getSalesPrice() - sales[0][0].getProduct().getPrice();

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] != null) {
                    double profit2 = sales[i][j].getSalesPrice() - sales[i][j].getProduct().getPrice();
                    if (profit2 > profit) {
                        profit = profit2;
                        name = sales[i][j].getProduct().getTitle();
                        id=sales[i][j].getProduct().getProductID();
                    }
                }
            }
        }
        System.out.println(id +" "+name + "------------->" + profit + "TL profit.");
    }
    public void MostExpensiveProduct(Sales[][] sales){
        double price=sales[0][0].getSalesPrice();
        String name=null;
        String id=null;
        for (int i=0;i<sales.length;i++){
            for(int j=0;j<sales[i].length;j++){
                if (sales[i][j]!=null){
                    double price2=sales[i][j].getSalesPrice();
                    if(price2>price){
                        price=price2;
                        name=sales[i][j].getProduct().getTitle();
                        id=sales[i][j].getProduct().getProductID();
                    }
                }
            }
        }
        System.out.println(id+" "+name+"---------> with sales price "+price+"TL");
    }
    public void customerMostPurchases(Sales[] sales) {
        int index=0;
        int freq = 0;
        for (int i = 0; i < sales.length; i++) {
            int count = 1;
            if (sales[i] != null) {
                for (int j = 0; j < sales.length; j++) {
                    if (sales[j] != null) {
                        if (sales[i].getCustomer().getCustomId().equals(sales[j].getCustomer().getCustomId())) {
                            count++;
                        }
                    }
                }
            }
            if (count > freq) {
                freq = count;
                index=i;
            }
        }
        System.out.println(sales[index].getCustomer().getCustomId()+" "+sales[index].getCustomer().getName()
        +" "+sales[index].getCustomer().getEmail()+" "+sales[index].getCustomer().getCountry()+" "+
                sales[index].getCustomer().getAddress()+" -------->"+freq+" purchases");
    }

    public void totalProfit(Sales[][] sales){
        double total=0;
        for(int i=0;i< sales.length;i++){
            for (int j=0;j<sales[i].length;j++){
                if(sales[i][j]!=null){
                    total+=sales[i][j].getSalesPrice()-sales[i][j].getProduct().getPrice();
                }
            }
        }
        System.out.println("TOTAL PROFIT:"+total);
    }

    public void leastProfitofS1(Sales[][] sales){
        double leastProfit=sales[0][0].getSalesPrice()-sales[0][0].getProduct().getPrice();
        int index=0;
        for(int j=1;j<sales[0].length;j++){
            if(sales[0][j]!=null){
                double leastProfit2=sales[0][j].getSalesPrice()-sales[0][j].getProduct().getPrice();
                if(leastProfit2<leastProfit){
                    leastProfit=leastProfit2;
                    index=j;
            }
            }
        }
        System.out.println(sales[0][index].getProduct().getProductID()+" "+
                sales[0][index].getProduct().getTitle()+" "+"---> Least profit:"+leastProfit);

    }

}
