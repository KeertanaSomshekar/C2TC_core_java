import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class Program09 {

	public static void main(String[] args) {
		EnumSet<WeekDay> weekDaySet=EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
		System.out.println("iterating weekday set using for-each");
		for(WeekDay weekDay:weekDaySet) {
			System.out.println("WeekDay: "+weekDay);
		}
		System.out.println("-------------------------------------------------------");
		EnumSet<WeekDay> weekEndSet=EnumSet.complementOf(weekDaySet);
		System.out.println("iterating weekend set using iterator");
		Iterator<WeekDay> itr=weekEndSet.iterator();
		while(itr.hasNext()) {
			System.out.println("WeekDay: "+itr.next());
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Need to Work? "+isWorkingDay(weekDaySet, WeekDay.MONDAY));
		System.out.println("Need to Work? "+isWorkingDay(weekDaySet, WeekDay.SATURDAY));
		System.out.println("Need to Work? "+isWorkingDay(weekDaySet, WeekDay.SUNDAY));
	}
	
	private static boolean isWorkingDay(Set<WeekDay> daysSet, WeekDay day) {
		return daysSet.contains(day);
	}
}
