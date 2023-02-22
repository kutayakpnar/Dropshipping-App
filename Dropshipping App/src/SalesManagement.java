public class SalesManagement {
    private Sales[][] sales;

    public SalesManagement() {
        sales = new Sales[3][100];
    }

    public Sales[][] getSales() {

        return sales;
    }

    public void setSales(Sales[][] sales) {

        this.sales = sales;
    }

    public Sales[] getAllSales(Sales[][] sales) {
        int count =0;
        Sales[] allSales = new Sales[100];
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] != null) {
                    allSales[count] = sales[i][j];
                    count++;
                }
            }
        }
        return allSales;
    }


}
