public class Day {
	private int day;
	
	public Day (int d) {
		day = d;
		if ((day < 0) || (day > 30)) {
			day = 1;
		}
	}
}