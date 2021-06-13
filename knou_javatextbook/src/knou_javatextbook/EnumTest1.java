package knou_javatextbook;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day = Day.MONDAY;
		for (Day d : Day.values()) {
			System.out.println(d);
		}
	}

}
