package vn.edu.ntu.nguyenanhhai.controllers;

import android.content.Context;

import androidx.room.Room;

import java.util.List;

import vn.edu.ntu.nguyenanhhai.models.AppDatabase;
import vn.edu.ntu.nguyenanhhai.models.DAO;
import vn.edu.ntu.nguyenanhhai.models.Product;

public class ShopControllerDB implements IShopController {
  AppDatabase database;
  DAO dao;

  public ShopControllerDB(Context context) {
    database = Room.databaseBuilder(context, AppDatabase.class, "appdb")
            .allowMainThreadQueries()
            .build();
    dao = database.getDAO();
  }
  @Override
  public List<Product> getAllProduct() {
    return dao.getAllProduct();
  }

  @Override
  public void addProduct(Product product) {
    dao.insertProduct(product);
  }
}
