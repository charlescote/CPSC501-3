import java.util.Scanner;

public class ObjectCreator {
	
	Object obj;
	Scanner scan;
	
	public ObjectCreator () {
		int selection;
		System.out.println("List of objects to be created");
		System.out.println("1. Year (single int field)");
		System.out.println("2. Date (Year, Month and Day fields)");
		System.out.println("3. ArrayOfInt (array of integers)");
		System.out.println("4. Appointments (array of Date objects)");
		System.out.println("5. ArrayOfIntLL (linked list of ArrayOfInts)");
		System.out.println("Please enter your selection (1-5): ");
		scan = new Scanner(System.in);
		selection = scan.nextInt();
		switch (selection) {
			case 1: 
				makeYear();
				break;
			case 2: 
				makeDate();
				break;
			case 3: 
				makeAOI();
				break;
			case 4: 
				makeAppts();
				break;
			case 5: 
				makeAOILL();
				break;
			default:
				makeYear();
		}
	}
	
	
	private void makeYear() {
		int year;
		System.out.println("Enter the year: ");
		year = scan.nextInt();
		obj = new Year(year);
	}
	
	
	private void makeDate() {
		int year;
		int month;
		int day;
		System.out.println("Enter the year: ");
		year = scan.nextInt();
		System.out.println("Enter the month: ");
		month = scan.nextInt();
		System.out.println("Enter the day: ");
		day = scan.nextInt();
		obj = new Date(year, month, day);
	}
	
	
	private void makeAOI() {
		int int1;
		int int2;
		int int3;
		System.out.println("Enter the first integer: ");
		int1 = scan.nextInt();
		System.out.println("Enter the second integer: ");
		int2 = scan.nextInt();
		System.out.println("Enter the third integer: ");
		int3 = scan.nextInt();
		obj = new ArrayOfInt(int1, int2, int3);
	}
	
	
	private void makeAppts() {
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		int year3;
		int month3;
		int day3;
		System.out.println("Enter the year of first appt.: ");
		year1 = scan.nextInt();
		System.out.println("Enter the month of first appt.: ");
		month1 = scan.nextInt();
		System.out.println("Enter the day of first appt.: ");
		day1 = scan.nextInt();
		System.out.println("Enter the year of second appt.: ");
		year2 = scan.nextInt();
		System.out.println("Enter the month of second appt.: ");
		month2 = scan.nextInt();
		System.out.println("Enter the day of second appt.: ");
		day2 = scan.nextInt();
		System.out.println("Enter the year of third appt.: ");
		year3 = scan.nextInt();
		System.out.println("Enter the month of third appt.: ");
		month3 = scan.nextInt();
		System.out.println("Enter the day of third appt.: ");
		day3 = scan.nextInt();
		obj = new Appointments(year1, month1, day1, year2, month2, day2, year3, month3, day3);
	}
	
	
	private void makeAOILL() {
		int int1;
		int int2;
		int int3;
		int int4;
		int int5;
		int int6;
		int int7;
		int int8;
		int int9;
		System.out.println("Enter the first integer: ");
		int1 = scan.nextInt();
		System.out.println("Enter the second integer: ");
		int2 = scan.nextInt();
		System.out.println("Enter the third integer: ");
		int3 = scan.nextInt();
		System.out.println("Enter the fourth integer: ");
		int4 = scan.nextInt();
		System.out.println("Enter the fifth integer: ");
		int5 = scan.nextInt();
		System.out.println("Enter the sixth integer: ");
		int6 = scan.nextInt();
		System.out.println("Enter the seventh integer: ");
		int7 = scan.nextInt();
		System.out.println("Enter the eigth integer: ");
		int8 = scan.nextInt();
		System.out.println("Enter the ninth integer: ");
		int9 = scan.nextInt();
		obj = new ArrayOfIntLL(int1, int2, int3, int4, int5, int6, int7, int8, int9);
	}
	
}
		
		
		
		