package com.demo.apiexamples.data;

public class Order {
    private String customername;
    private String productname;

    private int quantity;

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customername='" + customername + '\'' +
                ", productname='" + productname + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
