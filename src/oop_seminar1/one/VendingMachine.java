package oop_seminar1.one;

import java.util.List;

public class VendingMachine {
    private List<Product> productList;

    public VendingMachine(List<Product> productList) {
        
        this.productList = productList;
    }

    public List<Product> getProductList() {

        return productList;
    }

    public void setProductList(List<Product> productList) {

        this.productList = productList;
    }

    public Product getProductByName(String name){
        for (Product product: productList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }
    public Product getProductByCost(double cost){
        for (Product product: productList) {
            if (product.getCost() == cost)
                return product;
        }
        return null;
    }
}
