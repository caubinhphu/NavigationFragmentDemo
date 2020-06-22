package vn.edu.ntu.nguyenanhhai.models;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Product.class, Cart.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
  public abstract DAO getDAO();
}
