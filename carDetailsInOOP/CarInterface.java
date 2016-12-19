package carDetailsInOOP;

public interface CarInterface {
	//public void setManufacturerName(String manu);
	public boolean matchPassword(String userInput);
	public double getPriceWithTax();
	public void setAvailability(boolean ava);
	public void addToCart(double priceWithTax);
}