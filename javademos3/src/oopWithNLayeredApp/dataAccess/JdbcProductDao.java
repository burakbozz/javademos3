package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// sadece db eri�im kodlar� yaz�l�r. ...sql
		System.out.println("JDBC ile veritaban�na eklendi.");
	}
}

