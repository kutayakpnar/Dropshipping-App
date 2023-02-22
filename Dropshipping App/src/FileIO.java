import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.io.*;

public class FileIO {
    private Customer[] customers=new Customer[100];
    private Sales[][] salesArr=new Sales[3][100];
    Supplier sup=new Supplier();

    public void readProducts(){
        try{
        String pro1="S1_Products.csv";

        Product[] products=new Product[100];
        BufferedReader input=new BufferedReader(new FileReader(pro1));
        int i=0;
        input.readLine(); //İlk satır
        String line=input.readLine();;
        while (line!=null){
           String[] a =line.split(",");
           String productId=a[0];
           String title=a[1];
           double rate=Double.parseDouble(a[2]);
           double numOfRew=Double.parseDouble(a[3]);
           double price=Double.parseDouble(a[4]);
           Product product=new Product(productId,title,rate,numOfRew,price);
           products[i]=product;
           line=input.readLine();
           i++;
       }
        String pro2="S2_Products.csv";
        BufferedReader input2=new BufferedReader(new FileReader(pro2));
        input2.readLine();
        String line2=input2.readLine();
        while (line2!=null){
            String[] a =line2.split(",");
            String productId=a[0];
            String title=a[1];
            double rate=Double.parseDouble(a[2]);
            double numOfRew=Double.parseDouble(a[3]);
            double price=Double.parseDouble(a[4]);
            Product product=new Product(productId,title,rate,numOfRew,price);
            products[i]=product;
            line2=input2.readLine();
            i++;
        }
        String pro3="S3_Products.csv";
        BufferedReader input3=new BufferedReader(new FileReader(pro3));
        input3.readLine();
        String line3=input3.readLine();
        while (line3!=null){
            String[] a =line3.split(",");
            String productId=a[0];
            String title=a[1];
            double rate=Double.parseDouble(a[2]);
            double numOfRew=Double.parseDouble(a[3]);
            double price=Double.parseDouble(a[4]);
            Product product=new Product(productId,title,rate,numOfRew,price);
            products[i]=product;
            line3=input3.readLine();
            i++;
        }
        sup.setProducts(products);
        //sup.printProducts();
        input.close();
        }catch (Exception e){
        System.out.println(e.getMessage());
        System.out.println("Exception occurs!");
        System.exit(0);

    }

    }
    public void readCustomers(){

        try {
            String path="Customers.csv";
            BufferedReader input=new BufferedReader(new FileReader(path));
            input.readLine();
            String line=input.readLine();
            int i=0;
            while(line !=null){
                String[] a=line.split(",");
                String id=a[0];
                String name=a[1];
                String email=a[2];
                String country=a[3];
                String address=a[4];
                Customer customer=new Customer(id,name,email,country,address);
                customers[i]=customer;
                i++;
                line=input.readLine();
            }

        }catch (Exception e){
            System.out.println("Exception while reading Customers.");
            System.out.println(e.getMessage());
            System.exit(1);
        }


    }
    public Sales[][] readSales(){
        SalesManagement salesManagement=new SalesManagement();
        String s1path="S1_Sales.csv";
        String s2path="S2_Sales.csv";
        String s3path="S3_Sales.csv";
        try {
            BufferedReader input=new BufferedReader(new FileReader(s1path));
            input.readLine();
            int i=0;
            String line=input.readLine();
            while (line!=null){
                String[] a=line.split(",");
                String id=a[0];
                Customer customer=null;
                for(int x=0;x<customers.length;x++){
                    //System.out.println(customers[x].getCustomId());
                    if(customers[x].getCustomId().equals(a[1]) && customers[x]!=null){
                        customer=customers[x];
                        break;
                    }
                }
                Product product=null;
                for (int x=0;x<sup.getProducts().length;x++){
                    if(sup.getProducts()[x].getProductID().equals(a[2])){
                        product=sup.getProducts()[x];
                        break;
                    }
                }
                String salesDate=a[3];
                salesArr[0][i]=new Sales(id,customer,product,salesDate);;
                i++;
                line=input.readLine();
            }
            BufferedReader input2=new BufferedReader(new FileReader(s2path));
            input2.readLine();
            int index=0;
            String line2=input2.readLine();
            while (line2!=null){
                String[] a=line2.split(",");
                String id=a[0];
                Customer customer=null;
                for(int x=0;x<customers.length;x++){
                    //System.out.println(customers[x].getCustomId());
                    if(customers[x].getCustomId().equals(a[1]) && customers[x]!=null){
                        customer=customers[x];
                        break;
                    }
                }
                Product product=null;
                for (int x=0;x<sup.getProducts().length;x++){
                    if(sup.getProducts()[x].getProductID().equals(a[2])){
                        product=sup.getProducts()[x];
                        break;
                    }
                }
                String salesDate=a[3];
                salesArr[1][index]=new Sales(id,customer,product,salesDate);;
                index++;
                line2=input2.readLine();
            }
            BufferedReader input3=new BufferedReader(new FileReader(s3path));
            input3.readLine();
            int index2=0;
            String line3=input3.readLine();
            while (line3!=null){
                String[] a=line3.split(",");
                String id=a[0];
                Customer customer=null;
                for(int x=0;x<customers.length;x++){
                    //System.out.println(customers[x].getCustomId());
                    if(customers[x].getCustomId().equals(a[1]) && customers[x]!=null){
                        customer=customers[x];
                        break;
                    }
                }
                Product product=null;
                for (int x=0;x<sup.getProducts().length;x++){
                    if(sup.getProducts()[x].getProductID().equals(a[2])){
                        product=sup.getProducts()[x];
                        break;
                    }
                }
                String salesDate=a[3];
                salesArr[2][index2]=new Sales(id,customer,product,salesDate);;
                index2++;
                line3=input3.readLine();
            }

        }catch (Exception e){
            System.out.println("Exception occurs when read Sales");
            System.out.println(e.getMessage());
            System.exit(1);
        }

        return salesArr;
    }

}




