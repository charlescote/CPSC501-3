public class Month {
	private int month;
	
	public Month () {
		month = 1;
	}
	
	public Month (int m) {
		month = m;
		if ((month < 1) || (month > 12)) {
			month = 1;
		}
	}
}