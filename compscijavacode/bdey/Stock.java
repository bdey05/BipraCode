package bdey;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock (String s,String n, double p, double c){
		symbol = s;
		name = n;
		previousClosingPrice = p;
		currentPrice = c;
	}
	public String getSymbol(){
		return symbol;
	}
	public String getName(){
		return name;
	}
	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}
	public double getCurrentPrice(){
		return currentPrice;
	}
	public double getChangePercent(){
		return (currentPrice-previousClosingPrice)/(previousClosingPrice)*100;				
	}
}
