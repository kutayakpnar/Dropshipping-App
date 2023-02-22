public class ProgramExecuter {

    public void run(){
        FileIO x=new FileIO();
        x.readProducts();
        x.readCustomers();
        SalesManagement sales=new SalesManagement();
        sales.setSales(x.readSales());
        SalesQuery query=new SalesQuery();
        query.mostProfitProduct(sales.getSales());
        System.out.println("****************");
        query.MostExpensiveProduct(sales.getSales());
        System.out.println("****************");
        query.customerMostPurchases(sales.getAllSales(sales.getSales()));
        System.out.println("****************");
        query.totalProfit(sales.getSales());
        System.out.println("****************");
        query.leastProfitofS1(sales.getSales());
    }
}
