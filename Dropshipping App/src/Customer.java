public class Customer {
    private String  customId;
    private String name;
    private String email;
    private String country;
    private String address;

    Customer(String customId,String name,String email,String country, String address){
        this.customId=customId;
        this.name=name;
        this.email=email;
        this.country=country;
        this.address=address;

    }

    public String getName() {
        return name;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
