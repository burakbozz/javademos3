package staticDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductManger manager = new ProductManger();
		Product product = new Product();
		product.price = 10;
		product.name = "";
		
		manager.add(product);
		
		
	}

} 
