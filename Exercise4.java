
public class Exercise4 {
	
	public static void main(String[] args) {
		int value, date, year;
		String pet, street, day, month;
		value = 11;
		
		System.out.println("Exercise 4.1 (1)");
		System.out.println("No, I wug.");
		System.out.println("You wugga wug.");
		System.out.println("I wug.");
		System.out.println();
		System.out.println("Exercise 4.1 (3)");
		System.out.println("The program cannot run.");
		System.out.println();
		
		System.out.println("Exercise 4.2:");
		zool(11, "Irving", "Tanggang");
		System.out.println();
		
		System.out.println("Exercise 4.3");
		printAmerica("Saturday", "July", 22, 2015);
		printEurope("Saturday", 22, "July", 2015);
	}
		
		
	public static void zool(int value, String pet, String street) {
		
		System.out.print(value+" ");
		System.out.print(pet+" ");
		System.out.println(street);
	}
	public static void printAmerica(String day, String month, int date, int year) {
		System.out.print(day+", ");
		System.out.print(month+" ");
		System.out.print(date+", ");
		System.out.println(year);
		
	}
	public static void printEurope(String day, int date, String month, int year) {
		System.out.print(day+" ");
		System.out.print(date+" ");
		System.out.print(month+" ");
		System.out.println(year);
	
	}
}
