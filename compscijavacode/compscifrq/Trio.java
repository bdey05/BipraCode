public class Trio implements MenuItem{
	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;

	public Trio (Sandwich s, Salad sd, Drink d){
		sandwich = s;
		salad = sd;
		drink = d;
	}
	public String getName(){
		return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
	}
	public double getPrice(){
		if(sandwich.getPrice() >= salad.getPrice() && drink.getPrice() >= salad.getPrice()){
			return sandwich.getPrice() + drink.getPrice();
		}
		else if(salad.getPrice() >= sandwich.getPrice() && drink.getPrice() >= sandwich.getPrice()){
			return salad.getPrice() + drink.getPrice();
		}
		else{
			return sandwich.getPrice() + salad.getPrice();
		}
	}
}

