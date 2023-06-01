package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValelueInStock(){
		return price * quantity;
	}
	
	public void removeProduct(int quantity) { 
		this.quantity -= quantity;
	}
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValelueInStock());	
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
		
	}
}
