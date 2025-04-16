package org.example;

public class Product {
    private String product;
    private int productId;
    private int itemQuantity;
    private double price;
    private double totalValue;
//=========================Product getter and setter============================//
    public String getProduct(){
        return product;
    }
        //setter//
    public void setProduct(String newProduct){
        this.product = newProduct;
    }

//=========================Price getter and setter============================//

    public double getPrice(){
        return price;
    }
        // setter//
    public void setPrice(double newPrice){
        if (newPrice > 0) {
            this.price = newPrice;
        }
        else {
            System.out.println("Invalid price");
        }

    }
//=========================ID getter and setter============================//

    public int getProductId() {
        return productId;
    }
        //setter//
    public void setProductId(int productId) {
        this.productId = productId;
    }

//=========================Quantity getter and setter============================//
    public int getItemQuantity() {
        return itemQuantity;
    }
        //setter//
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }


//=========================Constructor============================//

    public Product(int productId, String product, int itemQuantity, double price) {
        this.productId = productId;
        this.itemQuantity = itemQuantity;
        this.product = product;
        this.price = price;
    }

//=========================-get product value based on price and quantity-============================//

public double getProductValue (){
    System.out.println(this.price + " * " + this.itemQuantity);
    this.totalValue = this.price * this.itemQuantity;
    return this.totalValue;
}


//=========================-print total value-============================//
    public void printTotalValue() {
        System.out.println("Total value for " + this.product + ": $" + String.format("%.2f", getProductValue()));
    }


//=========================-get product value based on price and quantity-============================//


}
