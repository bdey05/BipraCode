package compsci;


public class Animal {
  private String says;
  private int legs;

  public Animal(){}  

  public Animal(int l, String s){
    says = s;
    legs = l;
  }
  
  public int getLegs(){
    return legs;
  }
  public void getSays(){
	  System.out.println(says);
  }
}