package bdey;

public class Sundays{
	public static int getDay(int currentMonth, int currentYear){
		int numOfDays;
		if (currentMonth == 2){
			if (currentYear%4 == 0){
				numOfDays = 29;
			}
			else  {
				numOfDays = 28;
			}
		if (currentMonth == 4 || currentMonth == 6 || currentMonth == 9 || currentMonth == 11)
		        numOfDays = 30;
		    }
		numOfDays = 31;
		return numOfDays;

	}
	
	public static int countSundays(){
		int numOfSundays = 0;
		int day = 2;
		for (int currentYear = 1901; currentYear<=2000; currentYear++){
			for (int currentMonth = 1; currentMonth<=12; currentMonth++){
				for (int currentDay = 1; currentDay<=getDay(currentMonth, currentYear); currentDay++){
					day++;
					if(day == 7){
						if(currentDay == 1){
							numOfSundays++;
						}
						day = 0;
					}
				}
			}
		}
		return numOfSundays;
	}
	
	public static void main (String[]args){
		System.out.println("Sunday fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000) " + countSundays() + " times");
	}
}