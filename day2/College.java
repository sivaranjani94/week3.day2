package week3.day2;

public class College extends University {
	
	
	@Override
	public void ug() {
		System.out.println("for UG the period is 3 years");
		
	}

	public static void main(String[] args) {
		University university = new College();
		university.ug();
		university.pg();
		

	}

}
