package vn.edu.ntu.nguyenanhhai.models;

public class Product {
  private String name;
  private int price;
  private String desc;

  public Product(String name, int price, String desc) {
    this.name = name;
    this.price = price;
    this.desc = desc;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public String getDesc() {
    return desc;
  }
}
