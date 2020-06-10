package vn.edu.ntu.nguyenanhhai.controllers;

import java.util.List;

import vn.edu.ntu.nguyenanhhai.models.Product;

public interface ICartController {
  public boolean addProduct(Product product);
  public List<Product> getProducts();
  public void clearCart();
}
