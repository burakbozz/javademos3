package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// sadece db eri�im kodlar� yaz�l�r. ...sql
		System.out.println("hibernate ile veritaban�na eklendi.");
	}
}
