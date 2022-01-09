package week3.day2;

public class Desktop implements Software {

	@Override
	public void hardwareResources() {
System.out.println("hardware used to build the desktop");
	}

	@Override
	public void softwareResources() {
System.out.println("software to work in desktop");
	}

	public void desktopModel() {
System.out.println("desktop is made up of hardware and software");
	}

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.hardwareResources();
		desktop.softwareResources();
		desktop.desktopModel();

	}
}
