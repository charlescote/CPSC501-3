public class Day {
	private int day;
	
	public Day () {
		day = 1;
	}
	
	public Day (int d) {
		day = d;
		if ((day < 1) || (day > 30)) {
			day = 1;
		}
	}
}