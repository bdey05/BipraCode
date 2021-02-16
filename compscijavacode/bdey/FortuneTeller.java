package bdey;

public class FortuneTeller{
	public static void main(String[]args){
		String[]fortunes = {"You will be rich", "You will go bald", "You will break your leg", "You will win a Nobel Prize",
				"You will pass your next test", "You will fail all of your classes", "You will lose your memory", "You will meet a celebrity",
				"You will make a new friend", "You will miss your next class"};
		System.out.println(getFortune(fortunes));
		}
	public static String getFortune(String[]fortunes){
		int random = (int)(Math.random()*10);
		return fortunes[random];
	}
}

