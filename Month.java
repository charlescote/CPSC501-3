public class Month {
	private int month;
	
	public Month (int m) {
		month = m;
		if ((month < 0) || (month > 12)) {
			month = 1;
		}
	}
}