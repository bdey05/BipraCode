package compsci;

public class testAnimal{
	  public static void main(String[] args){
	     Animal a = new Animal(2, "Woof");
	     Cat c = new Cat(4, "Meow", "Fish");
	     a.getSays();
	     c.getSays();
	     c.getFood();
	     System.out.println(a.getLegs());
	     System.out.println(c.getLegs());
	  }
	}