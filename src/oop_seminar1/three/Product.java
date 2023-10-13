package oop_seminar1.three;

public class Product {

    protected String name;

    protected String brand;

    protected double price;

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        checkBrand(brand);
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        checkPrice(price);
    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        checkName(name);
    }

    public Product(){

        this("<name>", 100);
    }

    public Product(String name, double price){

        this( "<brand>", name, price);
    }

    public Product(String brand, String name, double price){
        checkName(name);
        checkBrand(brand);
        checkPrice(price);
    }

    private void checkPrice(double price){
        if (price < 100){
            this.price = 100;
        }
        else{
            this.price = price;
        }
    }

    private void checkName(String name){
        if (name == null || name.length() < 3){
            this.name = "<name>";
        }
        else {
            this.name = name;
        }
    }

    private void checkBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "<brand>";
        }
        else {
            this.brand = brand;
        }
    }

    public String displayInfo(){

        return String.format("%s - %s - %.2f", brand, name, price);
    }


}
