package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// sadece db eriþim kodlarý yazýlýr. ...sql
		System.out.println("hibernate ile veritabanýna eklendi.");
	}
}
