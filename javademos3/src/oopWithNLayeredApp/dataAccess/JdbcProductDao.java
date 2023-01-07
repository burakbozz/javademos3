package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// sadece db eriþim kodlarý yazýlýr. ...sql
		System.out.println("JDBC ile veritabanýna eklendi.");
	}
}

