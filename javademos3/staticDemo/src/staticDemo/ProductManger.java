package staticDemo;

public class ProductManger {
	
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi.");
		}
		else {
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}
	}
	
		
}
