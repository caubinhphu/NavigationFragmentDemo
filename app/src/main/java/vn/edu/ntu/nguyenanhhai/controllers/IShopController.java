package vn.edu.ntu.nguyenanhhai.controllers;

import java.util.List;

import vn.edu.ntu.nguyenanhhai.models.Product;

public interface IShopController {
  public List<Product> getAllProduct();
  public void addProduct(Product product);
}
