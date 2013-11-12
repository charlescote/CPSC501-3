public class Appointments {
	private Date[] appt;
	
	public Appointments (int yappt1, int mappt1, int dappt1, int yappt2, int mappt2, int dappt2, int yappt3, int mappt3, int dappt3) {
		appt = new Date[3];
		appt[0] = new Date(yappt1, mappt1, dappt1);
		appt[1] = new Date(yappt2, mappt2, dappt2);
		appt[2] = new Date(yappt3, mappt3, dappt3);
	}
}

	