package compsci;


public class Cat extends Animal{
  private String food, says;
  private int legs;
  
  public Cat(int l, String s, String f){
	super(l,s);
	food = f;
  }

  
  public void getFood(){
    System.out.println(food);
  }
  
  public int getLegs(){
    return (2*super.getLegs());
  }
}