package bdey;

public class Problem019 {

    private static int numberOfSundays() {
        int numberOfSundays = 0;
        int dayOfTheWeek = 2; // 1 Jan 1901 was a Tuesday
        for (int year=1901; year<=2000; year++) {
            for (int month=1; month<=12; month++) {
                for (int day=1; day<=getNumberOfDays(month,year); day++) {
                    dayOfTheWeek++;
                    if (dayOfTheWeek == 7) {
                        if (day == 1)
                            numberOfSundays++;
                        dayOfTheWeek = 0;
                    }
                }
            }
        }
        return numberOfSundays;
    }

    private static int getNumberOfDays(int month, int year) {
        if (month == 2)
            return year%4 == 0 ? 29 : 28;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        return 31;
    }

    public static void main(String[] args) {
        System.out.println("The number of Sundays on the first of the month during the twentieth century is:");
        System.out.println(numberOfSundays());
    }

}
