public class Date {
	private Year year;
	private Month month;
	private Day day;
	
	public Date (int y, int m, int d) {
		year = new Year(y);
		month = new Month(m);
		day = new Day(d);
	}
}