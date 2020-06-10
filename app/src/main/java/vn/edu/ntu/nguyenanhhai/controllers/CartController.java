package vn.edu.ntu.nguyenanhhai.controllers;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import vn.edu.ntu.nguyenanhhai.models.Product;

public class CartController extends Application implements ICartController {
  List<Product> products = new ArrayList<>();
  @Override
  public boolean addProduct(Product product) {
    if (!products.contains(product)) {
      products.add(product);
      return true;
    }
    return false;
  }

  @Override
  public List<Product> getProducts() {
    return products;
  }

  @Override
  public void clearCart() {
    products.clear();
  }
}
