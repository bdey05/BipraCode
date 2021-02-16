package bdey;

public class StockTest{
	public static void main(String[]args){
		Stock s = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		System.out.println("The symbol for the stock is " + s.getSymbol());
		System.out.println("The name of the stock is " + s.getName());
		System.out.println("The previous closing price was " + s.getPreviousClosingPrice());
		System.out.println("The current closing price is " + s.getCurrentPrice());
		System.out.println("The price-change percentage is " + s.getChangePercent() + "%");
	}
}